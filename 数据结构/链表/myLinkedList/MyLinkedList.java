package com.ruider.myLinkedList;


public class MyLinkedList {

    public Node head;

    public static class Node{    //ע�������������Ǿ�̬�࣬����Ĳ��Ժ��õ���̬��������
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }

    //���������ҵ����Ľڵ㣬�������
    public void addNode(Node node){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }

    //��ָ��λ�����ӽ��
    public void insertByIndex(int index,Node node){

        //��1��ʼ��
        //���Բ��뵽β������β���֮��������length()+1
        if(index<1||index>length()+1)
            return;
        Node  temp=head;
        int length=1;   //�������λ��
        while(temp.next!=null){
            if((index-1)==length++){    //index-1��Ϊ���ڶ�λĿ��λ��֮ǰ�Ϳ�ʼ����
                node.next=temp.next;
                temp.next=node;
                break;
            }
            temp=temp.next;
        }
    }

    //ɾ������
    public void deleteByIndex(int index){
        if(index<1||index>length())
            return;
        Node temp=head;
        int length=1;
        while(temp.next!=null){
            if((index-1)==length++){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }

    //��������,��node��ʼ����
    public void print(Node head){
        if(head==null)
            return;
        Node temp=head;
        while(temp.next!=null){
        	System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }


    //��ȡ�����ȣ���������
    public int length(){
        if(head==null&&head.next==null)
            return 0;
        Node temp=head;
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    
    /*
     * ���󣺲��ҵ�����k�����
     * ����˼·>>
     * 1������˼·������ҵ���length-k�����   
     * 2.����ָ�룬��ʼ��ָ��ͬһ��㣬֮���ָ�������k-1����֮��ͬʱ�ƶ���ֱ����ָ��ָ�������
     */
    //ʹ��˼·2
    public Node queryByIndex(int index){
    	if(head==null||index<1||index>length())
    		return null;
    	Node slow=head;
    	Node quick=head;
    	Node temp=head;
    	int step=0;
    	while(temp.next!=null||temp!=null){     //ע�������temp!=null�������ǳ���Ҫ����Ϊtemp.next!=null��������һ�����
    		if((index-1)==step++){
    			quick=temp;
    			break;
    		}
    		temp=temp.next;
    	}
    	
    	while(quick.next!=null){
    		slow=slow.next;
    		quick=quick.next;
    	}
    	return slow;
    	
    }

    /*
     * �����ҵ��м���
     * ˼·��
     * ����ָ�룬��ʼָ��ͬһ����㣬��ָ��ÿ������ƶ�һ������ָ��һ������������ָ���ߵ�β��㣬��ָ�����ڵ�λ�þ����м���
     */
    public Node getMiddleNode(){
    	if(head==null)
    		return null;
    	if(head.next==null)
    		return head;
    	Node slow=head;
    	Node quick=head;
    	
    	while(slow.next!=null&&quick.next!=null&&quick.next.next!=null){
    		slow=slow.next;
    		quick=quick.next.next;
    	}
    	return slow;
    }
    
  
    /*
    �����ж������Ƿ��л�
    ˼·������ָ�룬��ʼָ��ͬһ��㣬֮����ָ��ÿ����һ������ָ��ÿ����������������ָ��������ָ�����������,
         ����ָ������ָ���data��ͬʱ��֤���л�
     */
    public boolean hasLoop(){
        if(head==null||head.next==null)
            return false;
        Node slow=head;
        Node quick=head.next;
        while(slow.next!=null&&quick.next!=null&&quick.next.next!=null){
            if(quick.data==slow.data) {
                return true;
            }
            slow=slow.next;
            quick=quick.next.next;
        }
        return false;
    }
    
    
    /*
     * ˵��������ķ�ת�����Գ����⣬��ʮ������
     * ���󣺷�ת������
     * ˼·���ݹ�ʵ��
     */
    public Node reverse(Node head){
    	if(head==null||head.next==null){
    		return head;
    	}
    	Node reHead=reverse(head.next);    //�ҵ����һ����㣬����ֵ��reHead
    	head.next.next=head;     //reHeadָ��ǰ���
    	head.next=null;           //��ǰ����next��Ϊ��
    	return reHead;
    }
    
    public static void main(String[] args){
        MyLinkedList linkedList=new MyLinkedList();
        
        linkedList.head=new Node(0);

        Node node1=new Node(1);
        Node node2=new Node(2);
        
        Node node4=new Node(4);
        Node node5=new Node(5);

        linkedList.addNode(node1);
        linkedList.addNode(node2);
        //linkedList.addNode(node3);
        linkedList.addNode(node4);
        linkedList.addNode(node5);

        System.out.println("������>>"+linkedList.length());

       linkedList.print(linkedList.head);
       
       System.out.println();
       Node node3=new Node(3);
       linkedList.insertByIndex(4, node3);
       linkedList.print(linkedList.head);
       
       
       System.out.println();
       //linkedList.deleteByIndex(2);
       //linkedList.print();
       
       System.out.println(linkedList.queryByIndex(6).data);
       
       System.out.println(linkedList.getMiddleNode().data);
       
       /*
       node5.next=node2;
       
       System.out.println("hasLoop ?......  "+linkedList.hasLoop());
       */
       
       linkedList.print(linkedList.reverse(linkedList.head));
       
       
    }


}

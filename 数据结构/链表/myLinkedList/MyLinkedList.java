package com.ruider.myLinkedList;

import java.util.Stack;

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
    public static void print(Node head){
        if(head==null)
            return;
        Node temp=head;
        while(temp.next!=null){
        	System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
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
     * ˼·��1.�ݹ�ʵ��   2.�ǵݹ�ʵ��
     */
    //�ݹ�ʵ��
    public static  Node reverse(Node head){
    	if(head==null||head.next==null){
    		return head;
    	}
    	Node reHead=reverse(head.next);    //�ҵ����һ����㣬����ֵ��reHead
    	head.next.next=head;     //reHeadָ��ǰ���
    	head.next=null;           //��ǰ����next��Ϊ��
    	return reHead;
    }
    
    //�ǵݹ�ʵ�ַ�ת
    public static Node reverseList(Node head) {  
      
    //�������Ϊ�ջ���ֻ��һ���ڵ㣬���跴ת��ֱ�ӷ���ԭ�����ͷ���  
     if (head == null || head.next == null) {  
     return head;  
    }  
      
    Node current = head;  
    Node next = null; //���嵱ǰ������һ�����  
     Node reverseHead = null; //��ת��������ı�ͷ  
      
    while (current != null) {  
     next = current.next; //��ʱ����ס��ǰ������һ����㣬��Ϊ��һ��Ҫ��  
      
     current.next = reverseHead; //��current����һ�����ָ���������ͷ���  
     reverseHead = current;   
      
     current = next; // ����������current�ڵ����  
    }  
      
    return reverseHead;  
    }  
    
    /*
     * ���󣺺ϲ���������ĵ������ϲ�֮���������Ȼ���򡾳���Ƶ�ʸߡ�����ָoffer����17��
     * ˼·��
     * 
     * ����⾭��������˾���졣

		���磺
		
		����1��
		
		����1->2->3->4
		
		����2��
		
		����2->3->4->5
		
		�ϲ���
		
		����1->2->2->3->3->4->4->5
		
		����˼·��
		
		�������űȽ�����1������2��
		
		������������ڹ鲢��������Ҫע����������Ϊ�ա�������һ��Ϊ�յ������
			ֻ��ҪO (1) �Ŀռ䡣ʱ�临�Ӷ�ΪO (max(len1,len2))
     */
    public static  Node mergeTwoLinkedList(Node head1,Node head2){
    	//��������Ϊ�գ����ؿ�
    	if(head1==null&&head2==null)
    		return null;
    	//��һһ��Ϊ�շ�����һ��
    	if(head1==null)
    		return head2;
    	if(head2==null)
    		return head1;
    	
    	Node reHead;    //�������ͷ���
    	Node temp; 
    	//��ʼ���������ͷ���
    	if(head1.data<head2.data){
    		reHead=head1;
    		temp=head1;
    		head1=head1.next;
    	}else{
    		reHead=head2;
    	    temp=head2;
    	    head2=head2.next;
    	}
    	
    	//�������������㿪ʼ�Ƚϣ�
    	while(head1!=null&&head2!=null){
    		if(head1.data<head2.data){
    			temp.next=head1;
    			head1=head1.next;
    			temp=temp.next;
    		}else{
    			temp.next=head2;
    			head2=head2.next;
    			temp=temp.next;
    		}
    	}
    	
    	//������������е�����һ��û�б��Ƚ��ֱ꣬�ӱ�����������ĺ���
    	if(head1!=null)
    		temp.next=head1;
    	if(head2!=null)
    		temp.next=head2;
    	
    	return reHead;
    }
    
    
    /*
     * ���󣺴�β��ͷ��ӡ������

����˼·��
	����1��
			�������ֵߵ�˳������⣬����Ӧ�þͻ��뵽ջ������ȳ������ԣ�
			��һ��Ҫô�Լ�ʹ��ջ��Ҫô��ϵͳʹ��ջ��Ҳ���ǵݹ顣ע������Ϊ�յ������
			ʱ�临�Ӷ�ΪO��n��

����			ע����Ҫ�����Ƚ�������ת��Ȼ�����������������ƻ�����Ľṹ�������顣
	����2���ݹ飬��������
     */
    
    //����1��ջ��ʽ��β��ͷ��ӡ����
    public static void printFromLast1(Node head){
    	if(head==null)
    		return;
    	Stack<Node> stack=new Stack<Node>();
    	Node temp=head;
    	while(temp!=null){
    		stack.push(temp);
    		temp=temp.next;
    	}
    	
    	
    	while(!stack.isEmpty())
    		System.out.print(stack.pop().data+"-->");
    	System.out.println();
    }
    
    //����2:�ݹ��β��ͷ��ӡ
    public static void printFromLast2(Node head){
    	if(head==null)
    		return;
    	printFromLast1(head.next);
    	System.out.print(head.data+"-->");
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
        
        linkedList.addNode(node4);
        linkedList.addNode(node5);

        System.out.println("������>>"+linkedList.length());

        System.out.print("��ӡ����>>");
        MyLinkedList.print(linkedList.head);
        System.out.print("��β��ͷ��ӡ����>>");
       MyLinkedList.printFromLast2(linkedList.head);
       
       
       Node node3=new Node(3);
       linkedList.insertByIndex(4, node3);
       MyLinkedList.print(linkedList.head);
       
       
       
       linkedList.deleteByIndex(2);
       MyLinkedList.print(linkedList.head);
       
       System.out.println("��������������ֵΪ>>"+linkedList.queryByIndex(3).data);
       
       System.out.println("�����м�ڵ��ֵΪ>>"+linkedList.getMiddleNode().data);
       
       /*
       node5.next=node2;
       
       System.out.println("hasLoop ?......  "+linkedList.hasLoop());
       */
       
       MyLinkedList.print(MyLinkedList.reverse(linkedList.head));
       
       MyLinkedList linkedList1=new MyLinkedList();
       
       linkedList1.head=new Node(2);
       Node node6=new Node(3);
       Node node7=new Node(4);
       Node node8=new Node(5);
       Node node9=new Node(6);

       linkedList1.addNode(node6);
       linkedList1.addNode(node7);
       linkedList1.addNode(node8);
       linkedList1.addNode(node9);
       
       MyLinkedList.print(linkedList1.head);
       
       
       
       MyLinkedList newLinkdeList=new MyLinkedList();
       newLinkdeList.head=MyLinkedList.mergeTwoLinkedList(linkedList.head, linkedList1.head);
       MyLinkedList.print(newLinkdeList.head);
       
       
    }


}

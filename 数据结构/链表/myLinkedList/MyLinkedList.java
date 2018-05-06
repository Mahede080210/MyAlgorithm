package com.ruider.myLinkedList;


public class MyLinkedList {

    public Node head;

    public static class Node{    //注意这里的类必须是静态类，后面的测试后用到静态方法调用
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }

    //遍历链表，找到最后的节点，新增结点
    public void addNode(Node node){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }

    //在指定位置增加结点
    public void insertByIndex(int index,Node node){

        //从1开始，
        //可以插入到尾部或者尾结点之后，所以是length()+1
        if(index<1||index>length()+1)
            return;
        Node  temp=head;
        int length=1;   //标记锁定位置
        while(temp.next!=null){
            if((index-1)==length++){    //index-1是为了在定位目标位置之前就开始插入
                node.next=temp.next;
                temp.next=node;
                break;
            }
            temp=temp.next;
        }
    }

    //删除操作
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

    //遍历链表,从node开始遍历
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


    //获取链表长度，遍历链表
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
     * 需求：查找倒数第k个结点
     * 两种思路>>
     * 1，常规思路解决，找到第length-k个结点   
     * 2.快慢指针，初始都指在同一结点，之后快指针向后走k-1步，之后同时移动，直到快指针指到最后结点
     */
    //使用思路2
    public Node queryByIndex(int index){
    	if(head==null||index<1||index>length())
    		return null;
    	Node slow=head;
    	Node quick=head;
    	Node temp=head;
    	int step=0;
    	while(temp.next!=null||temp!=null){     //注意这里的temp!=null条件，非常重要，因为temp.next!=null会忽略最后一个结点
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
     * 需求：找到中间结点
     * 思路：
     * 快慢指针，初始指在同一个结点，慢指针每次向后移动一步，快指针一次走两步，快指针走到尾结点，慢指针所在的位置就是中间结点
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
    需求：判断链表是否有环
    思路：快慢指针，初始指在同一结点，之后慢指针每次走一步，快指针每次走两步，这样快指针走了慢指针的两倍长度,
         当快指针与慢指针的data相同时，证明有环
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
     * 说明：链表的反转是面试常考题，须十分熟练
     * 需求：反转单链表
     * 思路：递归实现
     */
    public Node reverse(Node head){
    	if(head==null||head.next==null){
    		return head;
    	}
    	Node reHead=reverse(head.next);    //找到最后一个结点，并赋值给reHead
    	head.next.next=head;     //reHead指向当前结点
    	head.next=null;           //当前结点的next置为空
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

        System.out.println("链表长度>>"+linkedList.length());

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

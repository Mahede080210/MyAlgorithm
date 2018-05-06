package com.ruider.myLinkedList;

import java.util.Stack;

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
     * 思路：1.递归实现   2.非递归实现
     */
    //递归实现
    public static  Node reverse(Node head){
    	if(head==null||head.next==null){
    		return head;
    	}
    	Node reHead=reverse(head.next);    //找到最后一个结点，并赋值给reHead
    	head.next.next=head;     //reHead指向当前结点
    	head.next=null;           //当前结点的next置为空
    	return reHead;
    }
    
    //非递归实现反转
    public static Node reverseList(Node head) {  
      
    //如果链表为空或者只有一个节点，无需反转，直接返回原链表的头结点  
     if (head == null || head.next == null) {  
     return head;  
    }  
      
    Node current = head;  
    Node next = null; //定义当前结点的下一个结点  
     Node reverseHead = null; //反转后新链表的表头  
      
    while (current != null) {  
     next = current.next; //暂时保存住当前结点的下一个结点，因为下一次要用  
      
     current.next = reverseHead; //将current的下一个结点指向新链表的头结点  
     reverseHead = current;   
      
     current = next; // 操作结束后，current节点后移  
    }  
      
    return reverseHead;  
    }  
    
    /*
     * 需求：合并两个有序的单链表，合并之后的链表依然有序【出现频率高】（剑指offer，题17）
     * 思路：
     * 
     * 这道题经常被各公司考察。

		例如：
		
		链表1：
		
		　　1->2->3->4
		
		链表2：
		
		　　2->3->4->5
		
		合并后：
		
		　　1->2->2->3->3->4->4->5
		
		解题思路：
		
		　　挨着比较链表1和链表2。
		
		　　这个类似于归并排序。尤其要注意两个链表都为空、和其中一个为空的情况。
			只需要O (1) 的空间。时间复杂度为O (max(len1,len2))
     */
    public static  Node mergeTwoLinkedList(Node head1,Node head2){
    	//两个链表都为空，返回空
    	if(head1==null&&head2==null)
    		return null;
    	//任一一个为空返回另一个
    	if(head1==null)
    		return head2;
    	if(head2==null)
    		return head1;
    	
    	Node reHead;    //新链表的头结点
    	Node temp; 
    	//初始化新链表的头结点
    	if(head1.data<head2.data){
    		reHead=head1;
    		temp=head1;
    		head1=head1.next;
    	}else{
    		reHead=head2;
    	    temp=head2;
    	    head2=head2.next;
    	}
    	
    	//两个链表逐个结点开始比较，
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
    	
    	//如果两个链表中的任意一个没有被比较完，直接被接在新链表的后面
    	if(head1!=null)
    		temp.next=head1;
    	if(head2!=null)
    		temp.next=head2;
    	
    	return reHead;
    }
    
    
    /*
     * 需求：从尾到头打印单链表：

　　思路：
	方法1：
			对于这种颠倒顺序的问题，我们应该就会想到栈，后进先出。所以，
			这一题要么自己使用栈，要么让系统使用栈，也就是递归。注意链表为空的情况。
			时间复杂度为O（n）

　　			注：不要想着先将单链表反转，然后遍历输出，这样会破坏链表的结构，不建议。
	方法2：递归，代码优雅
     */
    
    //方法1：栈方式从尾到头打印链表
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
    
    //方法2:递归从尾到头打印
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

        System.out.println("链表长度>>"+linkedList.length());

        System.out.print("打印链表>>");
        MyLinkedList.print(linkedList.head);
        System.out.print("从尾到头打印链表>>");
       MyLinkedList.printFromLast2(linkedList.head);
       
       
       Node node3=new Node(3);
       linkedList.insertByIndex(4, node3);
       MyLinkedList.print(linkedList.head);
       
       
       
       linkedList.deleteByIndex(2);
       MyLinkedList.print(linkedList.head);
       
       System.out.println("倒数第三个结点的值为>>"+linkedList.queryByIndex(3).data);
       
       System.out.println("链表中间节点的值为>>"+linkedList.getMiddleNode().data);
       
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

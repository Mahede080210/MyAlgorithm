## 判断链表是否有环
> 因为热爱，所以拼搏。。   ---来自大二的艺术家    --->RuiDer
`题目：给定一个链表，判断其是否有环？并找出入口节点与头节点的距离`
1.思路：给定一个慢节点，一个快节点，慢节点一次走一步，快节点一次走两步。判断慢节点是否与快节点相遇，如果不相遇，返回false。
=-----------------
#### 链表定义：
```java
public class Node{
  public int data;
  public Node next;
}
```
-----------
#### 解决方案
```java
public boolean hasLoop(Node n){         从第n个节点开始
  Node slow=n;
  Node fast=n.next;
  while(fast!=null&&fast.next!=null){
    if(slow.data==fast.data)
      return true;
    slow=slow.next;
    fast=fast.next.next;
  }
  return false;
}
```

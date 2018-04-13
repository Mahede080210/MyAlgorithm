

public class Test1 {
	public static LinkList revertList(LinkList head){
		if(head==null||head.next==null)
			return head;
		LinkList reHead=null;
		while(head!=null){
			LinkList cur=head.next;
			head.next=reHead;
			reHead=head;
			head=cur;
		}
		return head;
	}
}

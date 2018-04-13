

public class Test2 {
	int [] l=new int[100000];
	public  int getTreeWidth(TreeNode root){
		int front=-1, rear=-1;
		int last=0 , level=0;
		TreeNode[] quene=new TreeNode[100000];
		if(root==null)
			return 0;
		quene[++rear]=root;
		l[rear]=1;
		TreeNode p;
		while(front<rear){
			p=quene[++front];
			if(p.rightChild!=null){
				quene[++rear]=p.rightChild;
				l[++rear]=level+2;
			}
			if(p.leftChild!=null){
				quene[++rear]=p.leftChild;
				l[++rear]=level+2;
			}
			if(front==last){
				level++;
				last=rear;
			}
		}
		int n=0,m=0,i=0;
		for(int k=1;k<=level;k++){
			n=0;
			for(;l[i]==k;i++){
				n++;
			}
			if(n>m){
				m=n;
			}
		}
		return m;
	}
}

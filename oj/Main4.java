
/*题目描述
爱尔梅利亚把威廉吸引到了她自己——叹月的最初之兽的结界中。

 威廉发现这个结界可以用一个奇怪的函数表示：

当 x <= 100 时，f(x) = f(f(x + 11));

否则，f(x) = x - 10。

苦恼的威廉发现自己根本不会算这个东西。 请你帮他算一下吧！

输入
多组输入。

第一行是一个数 n, 表示这组数据有 n 个数。(n <= 300000)

以下 n 行，表示 x （x 均为整数）。 ( - 1011 <= x <= 1011)

输出
对于每个输入 x ，输出一行一个数，表示 f(x) 的值。*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main4 {

	public static int f(int x) {
		if (x > 100)
			return (x - 10);
		return f(f(x + 11));
	}

	public static void main(String[] args) {
		// TODO Auto-ge2
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		if (n <= 300000) {
			ArrayList<Integer> array = new ArrayList<Integer>();
			for (long i = 0; i < n; i++){
				int x=in.nextInt();
				if((x>=-1011)&&(x<=1011))
					array.add(x);
				else
					return;
			}
				
			Iterator<Integer> it = array.iterator();
			while (it.hasNext()) {
				System.out.println(f(it.next()));
			}
		}
	}
}

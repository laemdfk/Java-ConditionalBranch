import java.util.Random;

//prob3-8.(難易度：★)
//1から10までの乱数を発生させて表示し、その値が1でなければ”１ではありません”と表示し、
//1であれば、”1です。”と表示するプログラムを作りなさい。

public class conditional_branch_practice08 {
 public static void main(String arms[]) {
	 
	 Random rand = new Random();
	  int i = rand.nextInt(10) + 1;
	  System.out.println(i);
	  
	  if (i == 1) {
		System.out.println("iは1です");
	  }
	  
	  else {
		 System.out.println("iは1ではありません");
	  }
 }
}

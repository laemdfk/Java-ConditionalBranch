import java.util.Random;

//prob3-4.(難易度：★)
//1から100までの乱数を発生させてそれを画面に表示し、
//値が10以下か、90以上なら、”10以下か90以上の値です”と表示するプログラムを作りなさい。

public class conditional_branch_practice04 {
 public static void main(String arms[])  {


	 Random rand = new Random();
	 int i = rand.nextInt(100) + 1;
	 System.out.println(i);

	 if  (i <= 10  || 90 <= i) {
		 System.out.println("iは10以下か90以上の値です");
	 }
 }
}

import java.util.Random;

//prob3-3.(難易度：★)
//1から100までの乱数を発生させてそれを画面に表示し、、50未満ならば、”50未満です”と表示するプログラムを作りなさい。

public class conditional_branch_practice03 {
 public static void main(String arms[]) {
	 

	 Random rand = new Random();
	  int i = rand.nextInt(100) + 1 ;  //0~99までの値が返される。 ()の後ろに+1などをつけることで、その指定された引数+◯の最大値まで指定が可能？
	  System.out.println(i);
	  
	  if (i < 50) {
		  System.out.println("iは50未満です");
	  }
 }
}

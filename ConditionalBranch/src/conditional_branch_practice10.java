import java.util.Random;

//prob3-10.(難易度：★)
//1から100までの乱数を発生させて表示し、値が10以下か、90以上なら、”10以下か90以上の値です”と表示し、
//そうでなければ、”10より大きく90未満です”と表示するプログラムを作りなさい。
public class conditional_branch_practice10 {
 public static void main(String arams[])  {

	 Random rand = new Random();
	  int i = rand.nextInt(100) + 1;
	  System.out.println(i);

	  if (i <= 10 || 90 <= i) {
		  System.out.println("iは10以下か90以上の値です");
	  }

	  else {
		  System.out.println("10より大きく90未満です");
	  }
 }
}

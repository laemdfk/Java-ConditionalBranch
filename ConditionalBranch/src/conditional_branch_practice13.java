import java.util.Random;

//prob3-13.(難易度：★)
//１から3の乱数を発生させ、１なら、”グー”、2なら、”パー”3なら”チョキ”と表示するプログラムを作りなさい。


public class conditional_branch_practice13 {
 public static void main(String arms[])  {

	 Random rand = new Random();
	 int i = rand.nextInt(3) + 1;
	 System.out.println(i);

	 if (i == 1) {
		 System.out.println("グー");
	 }

	 else if (i == 2) {
		 System.out.println("チョキ");
	 }

	 else if (i == 3) {
		 System.out.println("パー");
	 }
 }
}

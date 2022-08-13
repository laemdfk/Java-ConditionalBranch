import java.util.Random;

//prob3-11.(難易度：★)
//１から100までの乱数を発生させ、値が20以上80未満であれば、”20以上80未満です”と表示し、
//そうでなければ、”20未満か、80以上です”と表示するプログラムを作りなさい。

public class conditional_branch_practice11 {
	public static void main(String arms[])   {

		Random rand = new Random();
		 int i = rand.nextInt(100) + 1;
		  System.out.println(i);

		  if ((20 <= i ) || (i < 80)) {
			System.out.println("iは20以上80未満です");
		  }

		  else {
			  System.out.println("20未満か、80以上です");
		  }
	}

}

//論理演算子 || 「または」を用いたコード。
//prob3-17.(難易度：★★)
//1から100までの数値を乱数で発生させ、以下の処理をしなさい。
//
//50以下の場合”50以下です。”と表示。
//偶数の場合、”偶数です。”と表示。
//ただし、50以下でかつ偶数の場合、”50以下の偶数です。”と表示。

import java.util.Random;

public class conditional_branch_practice17 {
	public static void main(String arms[]) {

		Random rand = new Random();
		 int i = rand.nextInt(100) + 1;
		  System.out.println(i);

		  if ((50 > i) && (i % 2 ==0)) {
			  System.out.println("50以下の偶数です");
		  }

		  else if ((i > 50) && (i % 2 == 0)) {
			  System.out.println("偶数です");
		  }

		  else if (50 > i) {
			  System.out.println("50以下です");
		  }
	}
}

//条件が最も複雑なものをifにし、残りはelse ifなどで定義すると、「一番複雑な挙動が出ない」を予防できる。
//import java.util.Random;を最初に定義すると、コンパイルエラー出にくい(random使う場合は)

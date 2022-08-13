import java.util.Random;

//prob3-16.(難易度：★★)
//1から100までの数値を乱数で発生させて表示し、以下の処理をしなさい。
//
//２の倍数であるなら、”2の倍数です。”と表示
//３の倍数であるなら、”3の倍数です。”と表示
//ただし、2の倍数でもあり、3の倍数でもある場合は、”2と3の公倍数です。”と表示。


public class conditional_branch_practice16 {
	public static void main(String arms[]) {

		Random rand = new Random();
		 int i = rand.nextInt(100) + 1;
		  System.out.println(i);

		  if (i % 2 == 0 && i % 3 == 0) {
			System.out.println("2と3の公倍数です");
		  }

		  else if (i % 2 == 0) {
			  System.out.println("2の倍数です");
		  }

		  else if (i % 3 == 0) {
			  System.out.println("3の倍数です");
		  }

//		  おまけ
		  else  {
			  System.out.println("2の倍数でも、3の倍数でもありません");
		  }
	}
}

import java.util.Random;

//prob3-14.(難易度：★)
//１から10までの二つの乱数を発生させ、それぞれa,bという変数に代入して表示し、
//aのほうが大きければ、”aのほうが大きいです。”と表示し、bのほうが大きければ”bのほうが大きいです。”と表示し、
//そうでなければ、”等しいです”と表示するプログラムを作りなさい。

public class conditional_branch_practice14 {
	public static void main(String arms[]) {

		Random rand = new Random();
		 int a = rand.nextInt(10) +1;
		 int b = rand.nextInt(10) +1;
		 System.out.println(a);
		 System.out.println(b);

		 if (a > b) {
			 System.out.println("aのほうが大きいです");
		 }

		 else if (a < b) {
			 System.out.println("bのほうが大きいです");
		 }

		 else if (a == b) {
			 System.out.println("等しいです");
		 }
	}

}

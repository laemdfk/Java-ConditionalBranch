import java.util.Random;

//prob3-15.(難易度：★★)
//１から100までの数値を乱数で発生させて表示し、以下の処理を行いなさい。
//
//80点以上なら”優”と表示。
//80点未満、70点以上なら、”良”と表示。
//70点未満、60点以上なら、”可”と表示。
//60点未満なら、”不可”と表示。

public class conditional_branch_practice15 {
	public static void main(String arms[]) {

		Random rand = new Random();
		 int score = rand.nextInt(100) +1;
		 System.out.println("点数:" + score);

		 if (80 <= score) {
			 System.out.println("優");
		 }

		 else if ((70 <= score) && (score < 80)) {
			 System.out.println("良");
		 }

		 else if ((60 <= score) && (score < 70)) {
			 System.out.println("可");
		 }

		 else if (score < 60) {
			 System.out.println("不可");
		 }
	}
}

//論理演算子 && 「かつ」を用いたコード。
//代入用の変数も意識する

import java.util.Random;

//prob3-9.(難易度：★)
//１から100までの乱数を発生させて表示し、50未満ならば、”50未満です”と
//そうでなければ、”50以上です”と表示するプログラムを作りなさい。

public class conditional_branch_practice09 {
	public static void main(String arms[]) {
	  Random rand = new Random();
		int i = rand.nextInt(100) + 1;
		System.out.println(i);

		if (i <= 50) {
			System.out.println("iは50未満です");
		}

		else {
			System.out.println("iは50以上です");
		}
	}

}

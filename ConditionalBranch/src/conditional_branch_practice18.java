//prob3-18.(難易度：★★)
//乱数で、－10から35までの乱数を発生させ、”摂氏○○度”（○○が、発生した乱数）と表示させ、
//その値により、以下のように表示しなさい。
//
//30度以上の場合は、”真夏日です。”と表示。
//25度以上、30度未満の場合”夏日です。”と表示。
//0度未満の場合、”真冬日です。”と表示。

import java.util.Random;

public class conditional_branch_practice18 {
	public static void main(String arms[]) {

		Random rand = new Random();
		int degrees = rand.nextInt(55) -10;
		System.out.println(degrees);

		if ((25 <= degrees) && (degrees <30)) {
			System.out.println("夏日です");
		}

		else if (30 <= degrees) {
			System.out.println("真夏日です");
		}

		else if (degrees < 0) {
			System.out.println("真冬日です");
		}
	}
}

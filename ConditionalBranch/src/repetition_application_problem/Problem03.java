package repetition_application_problem;

/* 練習問題 4 - 3
2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。 */

public class Problem03 {
	public static void main(String arms[]) {
		for (int i = 1, x = 2 ; i <= 8 ; i++ , x *= 2) {
			System.out.println("2の" + i + "乗は" + x);
		}
	}

}

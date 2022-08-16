package repetition_application_problem;

/* 練習問題 4 - 4
7 の階乗を計算し、表示するプログラムを作成しなさい。 */

public class Problem04 {
	public static void main(String arms[]) {
		int i = 1;
		for (int n = 2; n <= 7; n++) {
			i = i * n;
			System.out.println(i);
		}
	}

}

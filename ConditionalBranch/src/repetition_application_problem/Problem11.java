/* 練習問題 4 - 11
個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、
9 の次は 0 に戻るものとします。 */

package repetition_application_problem;

import java.util.Scanner;

public class Problem11 {
	public static void main(String arms[]) {
		System.out.println("好きな数字を入力してください");
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();

		for(int n = 0; n < i ; n++) {
			System.out.println(n % 10);
//			int i = scan.nextInt();で設定した数字分、forを回す。
//			この時、int n に代入された数字のあまりを出力させることでループさせる
		}

	}

}

/* 練習問題 4 - 13
ストライク・カウントを数えるプログラムを作成しなさい。

１球ごとにストライクかボールかを入力する。
３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
*/

package repetition_application_problem;

import java.util.Scanner;

public class Problem13 {
	public static void main(String arms[]) {

		System.out.println( "ストライクカウントを始めます");
		System.out.println("ストライク = 1 or ボール = 2 としてカウントします 結果を元に、1または2を入力してください");

		Scanner scan = new Scanner(System.in);

		int strike = 0;
		int ball = 0;



		while(strike < 3 && ball < 4) {
			System.out.println( "ストライク= 1 or ボール= 2 ？" );
			int count = scan.nextInt();

			if (count == 1) {
				strike++;
			}

			else if(count == 2) {
				ball++;
			}

			System.out.println("ストライクは" + strike + "回" + "ボールは" + ball + "回");
		}

	}
}


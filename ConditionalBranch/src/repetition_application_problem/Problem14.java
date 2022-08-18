/* 練習問題 4 - 14
前の問題に次の修正を加えなさい。

１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。*/

package repetition_application_problem;

import java.util.Scanner;

public class Problem14 {
	public static void main(String arms[]) {

	System.out.println( "ストライクカウントを始めます");
	System.out.println("ストライク = 1 or ボール = 2 or ファウル = 3としてカウントします 結果を元に、1~3のいずれかを入力してください");

	Scanner scan = new Scanner(System.in);

	int strike = 0;
	int ball = 0;
	int foul = 0;



	while(strike < 3 && ball < 4) {
		System.out.println( "ストライク= 1 or ボール= 2 or ファウル = 3 ？" );
		int count = scan.nextInt();

		if (count == 1) {
			strike++;
		}

		else if(count == 2) {
			ball++;
		}

		else if (count == 3 && strike < 2 ) {
        strike++;
//        2回までストライクにカウントするが、2は超えられない
		}

		System.out.println("ストライクは" + strike + "回" + "ボールは" + ball + "回");
	}

  }
}


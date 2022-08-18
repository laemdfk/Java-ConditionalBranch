/* 習問題 4 - 7
次のプログラムを作成しなさい。

巨人、阪神戦で毎回の得点を入力する。（１回～９回）
入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
※ 	試合は巨人の先行とする。
*/

package repetition_application_problem;

import java.util.Scanner;

public class Problem07 {
	public static void main (String arms[]) {
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );

		int giants = 0;
		int tigers = 0;



		for(int game = 1; game <= 9 ; game++) {
			Scanner scan = new Scanner(System.in);

			System.out.println(game + "回表、巨人の得点は?");
			int giantsResult = scan.nextInt();
//			giants += Integer.parseInt( br.readLine() );


			System.out.println( game + "回裏、阪神の得点は？" );
			int tigerResult = scan.nextInt();
//			 tigers += Integer.parseInt( br.readLine() );


		}

		System.out.println("巨人" + giants + "点," + "阪神" + tigers + "点");

		if(giants > tigers) {
			System.out.println("巨人の勝ち");
		}

		else if(giants < tigers) {
			System.out.println("阪神の勝ち");
		}

		else {
			System.out.println("引き分け");
		}

	}

}

/* 練習問題 4 - 18
数値を繰り返して入力し、0 が入力されたら入力を止め、
それまでの合計を表示するプログラムを作成しなさい。 */



package repetition_application_problem;

import java.util.Scanner;

public class Problem18 {
	public static void main(String arms[]) {
		System.out.println("好きな数字を入力してください");

		int i = 0;
		Scanner scan = new Scanner(System.in);

		for(; ;) {
			int n = scan.nextInt();
			if( n == 0 )
		        break;
//			変数nと0が等しくなった時点で処理を強制中断する

		    i += n;
		    
//		    i = i + n の意。
		}

		System.out.println( "合計は" + i );
		}
	}

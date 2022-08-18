package repetition_application_problem;

import java.util.Scanner;

/* 練習問題 4 - 6
整数、0 か 1 を 10 回入力する。これを対戦成績と考え、
0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。 */


public class Problem06 {
	public static void main (String arms[]) {

		Scanner scan = new Scanner(System.in);
//		int wins = scan.nextInt();

		int wins = 0;


        for( int win = 0 ; win < 10 ; win++ )
        {
        int result = scan.nextInt();

        if (result == 1) {
        	win += 1;
        }
        }

        System.out.println( "勝ちは" + wins + "回で、" + "負けは" + (10 - wins) + "でした");
	}

}


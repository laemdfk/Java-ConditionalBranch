/* 練習問題 4 - 21
サイズを示す数値を入力し、
そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。 */

package repetition_application_problem;

import java.util.Scanner;

public class Problem21 {
	public static void main(String arms[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("好きな数字を入力してください");
		int size = scan.nextInt();

		for(int i = 0; i < size ; i++) {
			for(int j = 0; j < size; j++) {

		      if( i == j || ( size - i - 1 ) == j )
	            System.out.print( "X" );
	           else
	            System.out.print( " " );
	        }

	    System.out.println( "" );
			}
		}
	}


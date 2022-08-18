/* 練習問題 4 - 20
サイズを示す数値を入力し、
何等かの文字で三角形を表示するプログラムを作成しなさい。 */

package repetition_application_problem;

import java.util.Scanner;

public class Problem20 {
	public static void main(String arms[]) {
	System.out.println("好きな数字を入力してください");
	Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();

     for( int i = 0 ; i < size ; i++ )
     {
      for( int j = 0 ; j <= i ; j++ )
       System.out.print( "$" );

      System.out.println();
//      $を三角形に出力するためのもの。中身は空で良い
      }

	}
}



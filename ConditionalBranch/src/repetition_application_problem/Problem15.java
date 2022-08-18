/* 練習問題 4 - 15
入力された数が素数かどうかを判定するプログラムを作成しなさい。 */

package repetition_application_problem;

import java.util.Scanner;

public class Problem15 {
	public static void main(String arms[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("好きな数字を入力してください");
		int i = scan.nextInt();

		System.out.println("もう一度、好きな数字を入力してください");
		int n = scan.nextInt();

		for( n = 2 ; n <= ( n / 2 ) ; n++ ){
//			forの中身をiからnに変更

		    if( ( i % n ) == 0 )
		        break;
		}

		if( n > ( i / 2 ) )
		    System.out.println( i + "は素数です" );
		else
		    System.out.println( i + "は素数ではありません" );

		/* 解答例
		 BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
       int value = Integer.parseInt( br.readLine() );
       int n;

       for( n = 2 ; n <= ( value / 2 ) ; n++ ){
        if( ( value % n ) == 0 )
          break;
       }

      if( n > ( value / 2 ) )
       System.out.println( value + "は素数です" );
      else
      System.out.println( value + "は素数ではありません" ); */
	}

}

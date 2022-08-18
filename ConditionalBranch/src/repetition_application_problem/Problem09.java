/* 練習問題 4 - 9
整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。 */

package repetition_application_problem;

import java.util.Scanner;

public class Problem09 {
	public static void main(String arms[]) {

		int max_value = 0;
		int min_value = 0;

		System.out.println("整数を 10 回入力してください");

		for( int i = 0 ; i < 10 ; i++ )
		{
			Scanner scan = new Scanner(System.in);
			int value = scan.nextInt();


		    if( i == 0 )
		    {
		        max_value = value;
		        min_value = value;
		    }
		    else
		    {
		        if( value > max_value )
		            max_value = value;

		        if( value < min_value )
		            min_value = value;
		    }
		}

		System.out.println( "最大値 = " + max_value + " 最小値 = " + min_value );
	}

}

package repetition_application_problem;

import java.util.Scanner;

/*  練習問題 4 - 5
整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。 
※ 	計算は整数で行い、小数点以下は切り捨ててよい。
*/

public class Problem05 {
	public static void main(String arms[]) {
//		
//		int total;   /* 変数を定義(=をつけなければ、右辺に数字を書く必要はない) */
//		int avg;
//		
////		追加
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
////      ここまで
//		
//        total = 0;
//        for(int i = 1; i <= 10; i++){
//            total = total + i;
//        }
//        
//        avg = total / 10;
//
//        System.out.print("合計：" + total + "  ");
//        System.out.println("平均：" + avg);
//        
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int sum = 0;

        for( int i = 0 ; i < 10 ; i++ )
        {
        int value = scan.nextInt();
        sum += value;
        }

        System.out.println( "平均は" + ( sum / 10 ) );
	}

}

/* 変数を定義しないことには始まらないので、まず変数を定義することを意識する */




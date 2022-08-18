/* 練習問題 4 - 10
個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
(横並びで出力させる)*/

package repetition_application_problem;

import java.util.Scanner;

public class Problem10 {
	public static void main(String arms[]) {

		System.out.println("好きな数字を入力してください");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();


		for(int n = 0; n < i; n++) {
			System.out.print("*");
		}
	}

}

/*
 *while文でも書ける。
 *
 package repetition_application_problem;

import java.util.Scanner;

public class Problem10 {
	public static void main(String arms[]) {

		System.out.println("好きな数字を入力してください");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();


         while(i > 0) {
			System.out.print("*");
			i--;
//			i == 0　になればいいので、足さずに引く。この記述がないとオーバーフロー起こすので要注意
		}
	}

}*
 *
  */

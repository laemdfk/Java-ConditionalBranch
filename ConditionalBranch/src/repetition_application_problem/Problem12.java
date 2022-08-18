/* 練習問題 4 - 12
数値を繰り返し入力し、
合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。*/

package repetition_application_problem;

import java.util.Scanner;

public class Problem12 {
	public static void main(String arms[]) {

		System.out.println("好きな数字を入力してください");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();



		while(i <= 100) {

			System.out.println("合計は" + i);
			i++;
		}

	}

}

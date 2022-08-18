/* 練習問題 4 - 16
2 以上の数値を入力し、素因数分解した結果を表示しなさい。

 */

package repetition_application_problem;

import java.util.Scanner;

public class Problem16 {
	public static void main(String arms[]) {
		Scanner scan = new Scanner(System.in);
		int i = 0;

		System.out.println("素因数分解を行います。2以上の数字を入力してください");
		int n = scan.nextInt();

		for(int x = 2; n > 1; x++) {
			while( ( n % x ) == 0 ){
		        System.out.print(x + " " );
		        n /= x;
			}
		}
	}
}

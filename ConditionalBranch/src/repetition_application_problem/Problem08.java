package repetition_application_problem;

import java.util.Scanner;

public class Problem08 {
	public static void main(String arms[]) {

		int max = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("自然数（正の整数）を 10 回入力してください");

		for(int i = 0; i < 10; i++) {
			
			int n = scan.nextInt();

			if (n > max) {
				max = n;
			}
			System.out.println( "最大値 = " + max);
		}
	}

}

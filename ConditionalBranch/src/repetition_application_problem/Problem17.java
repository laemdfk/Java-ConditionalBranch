/* 練習問題 4 - 17
九九表（一の段～九の段）を表示するプログラムを作成しなさい。 */

package repetition_application_problem;

public class Problem17 {
	public static void main(String arms[]) {
		for(int i = 1; i <= 9 ; i++) {
			
			for(int n = 1; n <= 9 ; n++) {
				System.out.println(i * n);
			}
			
			System.out.println(" ");
			
		}
	}

}

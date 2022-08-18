/* 練習問題 4 - 22
フィボナッチ数列を表示するプログラムを作成しなさい。

最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。

※フィボナッチ数列　=　[どの数字も前２つの数字を足した数字」という規則の数列
*/



package repetition_application_problem;


public class Problem22 {
	public static void main(String arms[]) {
		int i1 = 0;
		int i2 = 1;
		int i3 = i1 + i2;

		while(i1 <= 1000) {
			System.out.print(i1 + ",");

			i1 = i2;
			i2 = i3;
		    i3 = i1 + i2;
		}

	}
}

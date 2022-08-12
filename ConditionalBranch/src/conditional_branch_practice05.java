import java.util.Random;

public class conditional_branch_practice05 {
	public static void main(String arms[])  {
		
//prob3-5.(難易度：★)
//1から100までの乱数を発生させてそれを画面に表示し、値が20以上80未満であれば、”20以上80未満です”と表示するプログラムを作りなさい。
		
	   Random rand = new Random();
		 int i = rand.nextInt(100) + 1;
		 System.out.println(i);
		 
		 if (20 < i && i < 80) {
		  System.out.println("iは20以上80未満です");
		 }
		
		
	}

}

//prob3-6.(難易度：★)
//以下のプログラムは、1から6までの乱数（でたらめな数）を発生させて、表示させるプログラムです。
//このプログラムをに3以上の数値が出た場合、「3以上です」と表示するプログラムを作りなさい。

public class conditional_branch_practice06 {
	public static void main(String arms[])  {


//問題から
		int num = (int)(Math.random()*6)+1;    //  1から6までの乱数を発生させる
		  System.out.println("数値 : " + num);

//以下追記

		  if (3 <= num)  {
			  System.out.println("numは3以上です");
		  }


	}

}

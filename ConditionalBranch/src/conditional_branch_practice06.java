
public class conditional_branch_practice06 {
	public static void main(String arms[])  {
//prob3-6.(難易度：★)
//以下のプログラムは、1から6までの乱数（でたらめな数）を発生させて、表示させるプログラムです。


		int num = (int)(Math.random()*6)+1;    //  1から6までの乱数を発生させる
		  System.out.println("数値 : " + num);
		  
		  if (3 < num)  {
			  System.out.println("numは3以上です");
		  }
		 
//実行結果
//数値 ： 5   ← 実行ごとに1から6からの数値が出る
//このプログラムをに3以上の数値が出た場合、「3以上です」と表示するプログラムを作りなさい。
//
//期待される実行結果1(3以上の値の場合）
//数値：4
//3以上です。   ← 3以上の値の場合出る
//期待される実行結果1(3未満の値の場合）
//数値：1   ← 3未満なら何も出ない
		        
		        
	}

}

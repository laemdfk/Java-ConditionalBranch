//prob3-1.(難易度：★)
//1から10までの乱数を発生させてそれを画面に表示し、5以上ならば、”5以上です”と表示するプログラムを作りなさい。

import java.util.Random;

public class conditional_branch_practice {

	public static void main (String arms[]) {

//		ランダム表示させるメソッド→Random クラスの nextInt()を用いる
//		nextInt() は 引数を指定した場合、0から指定した値マイナス1までの値が返される。
//		ex:()の中が5
//		0~4までのいずれかの変数が返される
		
//　　　 指定しない場合はint型が取り得る値(ex:432123458)が返される。

		
		Random rand = new Random();              //新しくRamdom表示させると定義
		 int i = rand.nextInt(10) + 1 ;          //変数部分の定義。ここの"+"の後ろの整数を変更することで、表示する整数も変更される! 
		 System.out.println(i);                  //いつもの。整数の表示。
		 
		 if (i > 5) {                            //if文「もし変数iが5より大きければ」を定義
			 System.out.println("iは5以上です");   //「iは5以上です」を出力
		 }
		 
		 
//		 発展として、else文も追加すると、iは5以下でしたなども表示できそう。
		 

//		 下記コードのように、最初にmin/maxを定義し、書くことも可能(参考:DelftStack "Java で 1 から 10 までの乱数を生成する方法")
     int min = 1;
     int max = 10;

     Random random = new Random();

	 int value = random.nextInt(max + min) + min;
	  System.out.println(value);

	}
}

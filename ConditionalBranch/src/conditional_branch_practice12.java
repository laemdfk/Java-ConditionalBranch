import java.util.Random;

//prob3-12.(難易度：★)
//-10から10までの乱数を発生させて表示し、もしも負の値であれば”負の値です”と表示し、
//正の値であれば、”正の値です”と表示し、そうでなければ、”0です”と表示するプログラムを作りなさい。

//nextInt() の引数には負数を指定することができない
//→→乱数の最小値を減算することで、負数の範囲の乱数を取得する。

public class conditional_branch_practice12 {

	public static void main(String arms[]) {

		Random rand = new Random();
		 int i = rand.nextInt(21) -10 ;
		 System.out.println(i);

		 if(0 < i) {
			 System.out.println("iは正の値です");
		 }

		 else if(i < 0) {
			 System.out.println("iは負の値です");
		 }

		 else {
			 System.out.println("iは0です");
		 }

	}
}

//正でも負でもない0を基準にして、if文を書けばいいのでは?

//負の数から正の数(ex:-10~10)
//→→20あるが、-10~19までしかRandomは表示できないので、引数に+1して21を指定
//(0以外の値から乱数を取得したいときは、あらかじめ乱数の範囲の値を計算してから、引数に指定するため)
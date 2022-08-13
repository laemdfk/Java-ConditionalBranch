//prob3-2.(難易度：★)
//1から10までの乱数を発生させてそれを画面に表示し、その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。
//1から10までの乱数を発生させてそれを画面に表示し、
//その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。

import java.util.Random;

public class conditional_branch_practice02 {
 public static void main(String arms[])  {

	Random rand = new Random();
       int n = rand.nextInt(10) ;
       System.out.println(n);

       if (n > 1) {
     	  System.out.println("nは1ではありません");
       }
 }
}


//一つのプログラムに、同じローカル変数は使えない→→重複という形でエラーが起きた。
//変数の命名にも注意が必要と考えられる。(一目で意味が分かりやすく、被らない)
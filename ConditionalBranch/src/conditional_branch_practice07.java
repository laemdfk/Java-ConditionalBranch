import java.util.Random;

//prob3-7.(難易度：★)
//１から10までの乱数を発生させて表示し、5以上ならば、”5以上です”と表示し、
//そうでなければ、”5未満です”と表示するプログラムを作りなさい。

public class conditional_branch_practice07 {
  public static void main(String arms[])  {
	  Random rand = new Random();
	   int i = rand.nextInt(10) + 1;
	   System.out.println(i);
	   
	    if (i >= 5) {
	    	System.out.println("iは5以上です");
	    }
	    
	    else {
	    	System.out.println("iは5未満です");
	    }
  }
}

//elseの後ろには、条件文を書かない(Rubyと同様)
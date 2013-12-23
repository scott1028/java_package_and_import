import aa.ball;		// 記得要先告成 public 才可以存取( 單獨引用一個 file )

// javac main.java -encoding utf-8 && java Demo

class Demo{
	public static void main(String[] args) {
		System.out.println(1);
		book.echo();	// 同一個層級(default package)的不需要引用, JVM會自己找。
		ball.kick();
	}
}
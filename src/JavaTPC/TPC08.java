package JavaTPC;
// JVM
public class TPC08 {

	public static void main(String[] args) {
		int a= 30;
		int b =50;
		int v = add(a,b); // static method call
		System.out.println(v);
	}
		// 여기 static없으면 위에 add는 에러뜬다.
	public static int add (int a, int b) {
		int sum = a+b;
		return sum;
	}
}

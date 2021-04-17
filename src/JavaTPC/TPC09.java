package JavaTPC;

public class TPC09 {

	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		// a+b=?
		// int v = sum(a,b); 불가능
		TPC09 tpc = new TPC09(); // static 안붙은 메소드를 사용하려면 객체생성 해야함 heap Area
		int v = tpc.sum(a, b); //tpc가 TPC09를 가리키고 있음
		System.out.println(v);
	}
	
	public int sum(int a, int b) {
		int v=a+b;
		return v;
	}

}

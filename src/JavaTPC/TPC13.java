package JavaTPC;

import kr.tpc.Inflearn;

/* private 생성자 메소드
 * 객체생성에 관여하는 생성자 메서드가 private 접근제어를 가지면 객체를 생성할 수 없다는 뜻이 된다.
 * 객체를 생성하지 않고도 사용가능 해야한다. = 모든 클래스의 멤버가 static 멤버가 되어야 한다.*/
public class TPC13 {
	public static void main (String[]args) {
//		Inflearn inf = new Inflearn(); //private붙으면 불가능
//		inf.tpc();
		Inflearn.tpc(); //(static 붙었을 경우)
		//inf.java(); (static 안붙었을 경우)
		Inflearn.java();
		
		// Java API 생성자 private
		//System sys = new System();
		System.out.println("출력");
		Math m = new Math();
		int v = Math.max(10, 20);
		System.out.println(v);
	}
}


//static이 없는 경우 : instance 메소드 = 객체 생성 후 접근 가능, 또는 생성자가 public인 경우
//static멤버인 경우 : 객체생성 없이 접근 가능, 클래스 이름으로 접근
//모든 멤버가 static멤버이면 인위적으로 private생성자로 만들어 객체생성을 막을 수도 있다.
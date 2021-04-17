package JavaTPC;

import kr.tpc.OverLoad;

// 메소드 오버로딩 ; 같은 이름의 메소드를 여러개 가지면서 매개변수의 타입과 개수가 다르도록 하는 기술
// 생성자 메소드의 오버로딩 : 객체 초기화 가능한 메소드
// 오버로딩 : 속도가 떨어질 수도 있는데 안 떨어짐
// 왜? 컴파일러가 알아서 새로운 이름으로 만들어내기 때문
// = 정적 바인딩(컴파일 시점에서 호출될 메소드가 이미 결정되어 있는 바인딩 -> 속도와는 관계 없다.)
public class TPC16 {

	public static void main(String[] args) {
		// 1+1 = ?, 23.4+56 = ?, 56.7+78.9=?
		OverLoad ov = new OverLoad();
		ov.hap(20, 50); //ov.hap_int_int(20,50)
		ov.hap(23.4f, 56);//ov.hap_float_int(23.4f,56)
		ov.hap(56.7f, 78.9f);//ov.hap_float_float(56.7f,78.9f)
	}

}

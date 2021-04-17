package JavaTPC;

import kr.tpc.MemberVO;

// 정보은닉 (private)
/*private 일 경우, 변수명.으로 접근할 수 없기 때문에 setter,getter메소드를 생성해줘야 한다. */
public class TPC14 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO();
//		m.name = "홍길동";
//		m.age = 1000;
//		m.tel = "010-1111-1111";
//		m.addr = "서울";
//	
//		System.out.print(m.name + "\t");
//		System.out.print(m.age + "\t");
//		System.out.print(m.tel + "\t");
//		System.out.println(m.addr);
		
		m.setName("홍길동");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("서울");
		
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAge() + "\t");
		System.out.print(m.getTel() + "\t");
		System.out.println(m.getAddr());

	}

}

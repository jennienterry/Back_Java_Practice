package JavaTPC;

import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO("홍길동", 40, "010-1111-1111","서울");
		// setter method 필요 X : 생성자메소드를 받아서 만들었기 때문에
		System.out.println(m.getName());
		System.out.println(m.getAge());
		
		System.out.println(m.toString());
		
		MemberVO m1 = new MemberVO();
		m1.setName("나길동");
		m1.setAge(34);
		m1.setTel("010-2222-2222");
		m1.setAddr("광주");
		
		System.out.print(m1.getName()+"\t");
		System.out.print(m1.getAge()+"\t");
		System.out.print(m1.getTel()+"\t");
		System.out.println(m1.getAddr()+"\t");
		
	}

}

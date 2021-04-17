package JavaTPC;
// 생성자 메소드 이용해서 초기화하기

/* 생성자 메소드 / 생성자 : 생성+초기화 -> 중복정의
 * 1. 객체를 생성할 때 사용되는 메소드
 * 2. 객체 생성 후 객체의 초기화를 하는 역할 수행
 * 3. 특징 (1) 클래스 이름과 동일한 메소드
 * 		  (2) 메소드의 return type이 없다. (void도 아님)
 *        (3) public 접근 권한을 가진다. (단, private 생성자도 있음)
 *        (4) 생성자가 없을 때는 기본 생성자가 만들어진다.
 * */

// 기본 생성자
// public BookVO(){ super();}
import kr.tpc.BookVO;

public class TPC12 {

	public static void main(String[] args) { // kr.tpc.BookVO; 확인
		BookVO b1 = new BookVO(); // 객체생성
		// b1.title = "오라클" 여기서 값 넣으면 이 값으로 찍힘
		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company + "\t");
		System.out.println(b1.page);

		BookVO b2 = new BookVO();
		System.out.print(b2.title + "\t");
		System.out.print(b2.price + "\t");
		System.out.print(b2.company + "\t");
		System.out.println(b2.page);

		BookVO b3 = new BookVO("Python", 18000, "대림", 920); // 객체때 원하는 값 넣기 !
		System.out.print(b3.title + "\t");
		System.out.print(b3.price + "\t");
		System.out.print(b3.company + "\t");
		System.out.println(b3.page);
	}
// 초기화 : 원하는 값으로 마음대로 할 수 있어야 됨
}

//public class BookVO {
//	private String title;
//	private int price;
//	private String company;
//	private int page;}
//	일 때!
//	BookVO b = new BookVO("자바", 20000, "길벗", 790); = 초기값, 디폴트
//								값 전달 !
//public BookVO(String title, int price, String company, int page) {
//	this.title = title;
//	this.price = price;
//	this.company=company;
//	this.page=page; } = 이 과정을 초기화라고 함 *
//			* this : 자기 자신이 가지고 있는 멤버변수를 가리킴 (자기자신 !)
//			this 없이 그냥 title = title; 하면 다 매개변수 title이 되기 때문에 멤버변수에 값이 저장이 되지 않음
//			this() : 
//	BookVO b = new BookVO(); / BookVO b = new BookVO("자바", 20000, "길벗", 790);
//  -> 생성자 중복정의 : 객체지향에서는 메소드 이름 같아도 가능, 매개변수(파라미트)만 다르게하여 구분만 되면 됨
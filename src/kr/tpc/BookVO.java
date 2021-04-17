package kr.tpc;
// 책(Object) -> 제목,가격,출판사,페이지수...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 디폴트생성자메소드 BookVO(){}(생략)
	
//	public BookVO() {
//		//초기화 작업
//		this.title = "자바";
//		this.price = 14000;
//		this.company = "이지스";
//		this.page = 780;
		// 여기서 초기화 작업을 해주었기 때문에 TPC12에서 출력하면 이 값으로 출력됨
//	}
	
	//생성자 메소드의 중복정의 (overloading)
	public BookVO(String title, int price, String company, int page) {
		// 변수이름 상관은 없지만 헷갈리지 않기 위해 맞춰주는 것이 좋음
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
//		this(title,price,company,page);
	}
}

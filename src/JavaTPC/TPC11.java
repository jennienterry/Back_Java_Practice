package JavaTPC;

import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		// 책 1권을 저장하기 위해 [객체를 생성]하시오.
		BookVO b = new BookVO();
		b.title = "파이썬";
		b.price = 16000;
		b.company = "에이콘";
		b.page = 700;

		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page + "\t");
		
		System.out.println("----------------");
		
		BookVO b1 = new BookVO();
		b1.title = "오라클";
		b1.price = 16000;
		b1.company = "이지스퍼블리싱";
		b1.page = 560;

		System.out.print(b1.title + "\t");
		System.out.print(b1.price + "\t");
		System.out.print(b1.company + "\t");
		System.out.println(b1.page + "\t");

	}

}



/* 메소드
이름() : 메소드
단, 키워드()는 메소드가 아니다.
ex) int, string 타입같은 것들

    f      (x)   =   2x+1
메소드 이름  매개변수      리턴값

f(x) 통째로 리턴값으로 볼 줄 알아야 한다.
단, 리턴값이 있을 경우만 !

<메소드의 선언>
  리턴타입 메소드명(자료형 매개변수1,...){
           실행할 문장
           return 리턴값;
      }

<메소드 선언 순서>
1. 메소드 명을 생각한다.
2. 매개변수를 생각한다.
3. 실행할 문장과 리턴값을 생각한다.

<메소드 주의사항>
1. 매개변수가 없는 메소드는 외부에서 값을 전달 받을 수 없다.
2. 리턴값이 있는 메소드는 사용시 전체를 리턴값으로 보자.
3. 메소드 내부에 다른 메소드르 선언할 수 없다. (사용은 가능)
4. 메소드 선언시 매개변수는 저장공간이고,
   메소드 사용시에는 값을 그 자리 순서에 맞게 넣어준다.

*/

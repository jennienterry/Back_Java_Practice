package JavaTPC;

import kr.tpc.*;

// import java.lang.*; // 디폴트 패키지(생략) 만들어진것 사용
public class TPC18 {

	public static void main(String[] args) {
		//1. Java에서 제공해주는 class들.. API
		// 문자열 (String)
		java.lang.String str = new String("APPLE");
		System.out.println(str.toLowerCase()); //apple
		
		//2. 직접 만들어서 사용하는 class들.. DTO/VO, DAO, Utility.. API
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);
		
		//3. 다른 회사에서 만들어 놓은 class들.. API
	}

}


/* 학습정리 
* class  - datatype 측면 : 새로운 자료형을 만드는(설계하는) 도구 = 모델링 도구
          - OOP(객체지향측면 : 객체의 상태정보와 행위정보를 추출하여 캡슐화하는 도구

(변수앞에 붙는 타입)
(class 안에 모든 정보가 들어가는 것)
바구니 설계해서 정보넣고 이동하는것

* Model : class를 Model이라고도 부른다. (역할이 정해지므로)



* 우리가 만드는 MOdel의 종류 (3가지는 거의 대부분 만들게 되어있따)
1. DTO(Data Transfer Object) : 데이터 구조, 데이ㅌ터를 담는 여ㅑㄱ할, 이동하기 위해서 데이터를 담는다.
   - VO(Value Object) : 객체를 담아서 하나의 값(덩어리)으로 취급한다는 의미로
2. DAO(Date Access Object) : 데이터를 처리하는 역할(비즈니스 로직), 데이터베이스와 CRUD하는 역할

데이터베이스와 연동
3. Utility(Helper Object) : 도움을 주는 기능을 제공하는 역할 (ㄴ날짜 시간 통화 인코딩 등) 

* 우리가 앞으로 사용하게 될 class 들 : API (Application Programming Interface)
1. Java에서 제공해주는 class 들 - String, System, Integer,ArrayList, Map 등
2. 만들어 사용하는 class들(DTO,DAO,Utility)
3. 1,2번이 아닌 다른 사람이 만들어서 제공해주는 class 들 - Gson,Jsoup, POIm iText등


* MVNrepository.com (자바파일 연결해서 API 사용하기)
*/
package JavaTPC;

public class TPC35 {

	public static void main(String[] args) {
		String str1 = new String("APPLE"); // 다른 주소값을 가르키는 다른 객체
		String str2 = new String("APPLE");

		if(str1==str2) {
			System.out.println("YES");
		}else {
			System.out.println("NO"); // ㅇ : 주소값 비교
		}
		
		System.out.println("-------------------");
		
		if(str1.equals(str2)) {
			 System.out.println("YES"); // ㅇ : 문자열비교
		 }else {
			 System.out.println("NO");
		 }
		 
		System.out.println("-------------------");
		 
		 String str3 = "APPLE";
		 String str4 = "APPLE";

		 if(str3==str4) {
			 System.out.println("YES"); // ㅇ
		 }else {
			 System.out.println("NO"); 
		 }

		 System.out.println("-------------------");
		 
		 if(str3.equals(str4)) {
			 System.out.println("YES"); // ㅇ
		 }else {
			 System.out.println("NO");
		 }
		 

		
	}
	
	

}

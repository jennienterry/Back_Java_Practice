package kr.tpc;
// Override(재정의) : 상속관계에서 상속받은 하위클래스가 상위 클래스의 동작을 수정하는 것
// - 재정의(부모 메소드 무시) : 메모리에 부모와 자식 메서드가 공존하지만 결국에는 자식 메소드가 실행된다.
// - 동적바인딩 (호출될 메소드가 실행시점에서 결정되는 바인딩), 프로그램 속도가 떨어지는 원인이 되지만 이점이 더 많기 때문에 사용
public class Animal2 {
	//Dog, Cat  --> eat();
	public void eat() {
		System.out.println(""); //포괄적, 추상적
	}
}
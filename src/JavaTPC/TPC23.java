package JavaTPC;

import kr.tpc.Animal2;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
	public static void main(String[]args) {
	// 1. 다형성인수
	Dog d = new Dog();
	display(d);
	Cat c = new Cat();
	display(c);
}

	private static void display(Animal2 r) {
		r.eat();
		if (r instanceof Cat) {
			((Cat) r).night();
		}
	}
}
/*
 * 다형성 이론의 전제조건 (부모 클래스를 잘 활용하라) 1. 상속관계가 되어야 한다. 2. 객체생성을 upcasting으로 할 것 (상위
 * 클래스가 하위클래스에게 메세지를 보내야 하므로) 3. 하위클래스가 반드시 재정의(override)해야한다. (다형성이 보장되기 위해서는)
 * 4. 동적 바인딩을 통해 실현된다. (동적 바인딩 : 실행시점에서 사용될 메소드가 결정되는 바인딩 프로그램의 속도를 떨어뜨리는 원인이
 * 된다.)
 */
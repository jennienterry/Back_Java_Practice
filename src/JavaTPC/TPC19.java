package JavaTPC;

import kr.tpc.Animal2;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

	public static void main(String[] args) {
		//Dog, Cat --> Animal
	 
		Dog d = new Dog ();
		d.eat();
		
		Cat c = new Cat ();
		c.eat();
	
		// Dog.java(x), Dog.class(o)
		// Dog dd = new Dog();

		// Animal <--- [Dog.class, Cat.class]
		Animal2 ani = new Dog(); //상속관계이기 때문에 자동형변환 가능
		ani.eat();
		
		ani= new Cat();
		ani.eat();
//		ani.night();는 불가능 -> 아는메소드만 접근할 수 있는데 Animal부모타입은 night라는 메소드를 모르기 때문
		((Cat)ani).night(); //부모타입에서 자식타입으로 강제형변환
}
}
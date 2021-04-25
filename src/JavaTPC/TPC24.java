package JavaTPC;

import kr.tpc.Animal2;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {

	public static void main(String[] args) {
		//2. 다형성 배열
		//Dog,Cat 저장할 배열을 생성하시오.
		
		Animal2[] animal = new Animal2[2];
		animal[0] = new Dog();
		animal[1] = new Cat();
		
		for(int i=0; i<animal.length;i++) {
			animal[i].eat();
			if(animal[i] instanceof Cat) {
				((Cat)animal[i]).night();
			}
		}
	display(animal);
	
	}
	//메소드 따로 만들어서 사용해도 되고 위에처럼 사용해도 된다.
	private static void display(Animal2[]animal) { //다형성배열
		for(int i=0;i<animal.length;i++) {
			animal[i].eat();
			if(animal[i] instanceof Cat) {
				((Cat)animal[i]).night();
			}
		}
	}

}

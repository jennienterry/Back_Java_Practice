package kr.tpc;
// 상속 : 코드의 중복을 뺀다.
public class Cat extends Animal2{
	
	@Override
	public void eat() {
		System.out.println("고양이가 먹는다.");
	}
public void night() {
	System.out.println("밤에 눈에서 빛이난다.");
	}
}
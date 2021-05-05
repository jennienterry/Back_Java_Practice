package kr.tpc;

public class A extends Object {
	public A() {
		super();
	}
	
	public void display() {
		System.out.println("나는 A이다.");
	}
	
	@Override
	public String toString() {
		return "재정의 메소드입니다."; // 이 메세지가 나오게 된다.
	}
}

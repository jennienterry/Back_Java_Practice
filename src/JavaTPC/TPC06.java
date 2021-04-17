package JavaTPC;

//변수와 메소드
public class TPC06 {

	public static void main(String[] args) {

		
		System.out.println(makeArr());
	}

	public static int sum(int n1, int n2) {
		int s = n1+n2;
		return s;
	
	}		
	public static int makeArr() {
		int x=10;
		int y=20;
		int z=30;
		int[] arr = new int[3];
		arr[0]=x;
		arr[1]=y;
		arr[2]=z;
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
		
		
	}
	
	public static int hap(int n1, int n2) {
		int sum = 0;
		sum += n1;
		sum += n2;
		return sum;
	} 
	
	}


/*
 * 변수 데이터를 한 개 만(한 개의 형태)저장 가능하다. -> 저장만 한다. 메소드 동작을 한 후에 데이터를 한 개만 만들어 낸다. ->
 * 동작 후 저장한다. / 동작, 기능
 */

// "접근제한자 리턴타입 메서드이름(매개변수 리스트)"
// 메소드에서 리턴하는 값을 메소드 이름에 저장한다. (메소드 이름이 변수역할을 한다.)
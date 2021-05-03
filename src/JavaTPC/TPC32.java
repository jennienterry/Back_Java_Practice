package JavaTPC;

import kr.tpc.DbConnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {

	public static void main(String[] args) {
		// Oracle, MySQL -> Driver class
		
	DbConnect con =	new JavaOracle(); //인터페이스로 받아주기
	con.getConnection("url","bit", "12345");

	con = new JavaMySQL(); //인터페이스로 받아주기
	con.getConnection("url","root", "ABCDE");

	}

}

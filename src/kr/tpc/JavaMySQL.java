package kr.tpc;
//Driver class (jar 파일)
public class JavaMySQL implements DbConnect {
	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("MySQL DB가 접속됩니다.");
	}
}

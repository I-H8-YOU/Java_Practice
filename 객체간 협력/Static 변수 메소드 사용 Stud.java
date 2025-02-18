package real_practice;

public class Student_test {
	String studName;
	private static int sCardNum = 1000; // 학생 instance 생성시 100씩 증가
	int sRnum;
	
	public Student_test() {}
	public Student_test(String studName) {
		sCardNum += 100; //해당 constructor로 학생 인스턴스 생성시 sCardNum 값을 100증가 시킨다
		this.studName = studName;
		sRnum = sCardNum;
	}
	
	public static int getStudCardNum() {
		return sCardNum;
	}
	
	public static void setStudCardNum(int sCardNum) { //로컬변수, 클래스 변수만 사용가능
		Student_test.sCardNum = sCardNum; // this 예약어 사용 불가, this는 생성된 instance를 가르키는데 static 변수 즉 클래스 변수는 프로그램 실행 후 메모리에 자리 잡고 있기떄문.
	}
	
}

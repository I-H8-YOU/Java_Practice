package real_practice;

public class StudentTestEx {

	public static void main(String[] args) {
		Student_test studkim = new Student_test("Kim Banana");
		Student_test studlee = new Student_test("Lee Apple");
		
		System.out.println(Student_test.getStudCardNum()); // 출력 값은 1200, 두개의 instance 생성 했기 때문
		// Static 변수, 메소드는 호출시 클래스 이름으로 호출하기
		System.out.println(studkim.sRnum);
		System.out.println("학생 이름 => "+studkim.studName+"\t"+"학생카드 번호 => "+studkim.sRnum);
		
		System.out.println(studlee.sRnum);
		System.out.println("학생 이름 => "+studlee.studName+"\t"+"학생카드 번호 => "+studlee.sRnum);
	}

}

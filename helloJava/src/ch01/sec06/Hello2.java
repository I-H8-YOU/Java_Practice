package ch01.sec06;

public class Hello2 {	
	public static void main(String[] args) {
		double d1 = Math.random();
		int ranNum = (int)(Math.random() * 45) + 1;
		System.out.println(d1);
		System.out.println("난수 => "+ranNum);
	}
}

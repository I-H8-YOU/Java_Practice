package ch01.sec06;

import java.util.*;

public class Hello3 {
	public static int add(int n,int n1) {
		return n + n1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력1");
		int n1 = sc.nextInt();
		System.out.println("입력2");
		var n2 = sc.nextInt();
		System.out.println(Hello3.add(n1, n2));
		int x;
		x = 1;
		var y = 2;
		int ans = x + y;
		System.out.println(ans);
	}
}

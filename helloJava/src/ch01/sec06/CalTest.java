package ch01.sec06;

import java.util.stream.IntStream;
import java.util.*;

public class CalTest {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = "";
//		int i = 0;
//		while(true){
//			System.out.println("숫자를 입력하세요");
//			s = sc.nextLine();
//			for (; i <= Integer.parseInt(s); i++) {
//				System.out.println(Integer.toString(i).repeat(i));
//			}
//			if (i == Integer.parseInt(s) + 1)
//				break;
//		}
//		sc.close();
		// 4번
//		Scanner sc = new Scanner(System.in);
//		int[] nArr = new int[5];
//		System.out.println("숫자를 입력하세요");
//		for (int i = 0; i < 5; i++) {
//			System.out.print("숫자: ");
//			int num = sc.nextInt();
//			nArr[i] = num;
//			System.out.println();
//		}
//		System.out.println("최대값 => " + Arrays.stream(nArr).max().getAsInt());
//		sc.close();
		// 5번
//		for (int i = 1; i <= 10; i++) {
//			for (int k = 1; k <= 10; k++) {
//				System.out.print(k - 1 + i + "\t");
//			}
//			System.out.println();
//		}

		// 6번
		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("숫자를 입력하세요");
		//		int input = sc.nextInt();
		//		int sum = 0;
		//		if (input % 2 == 0) {
		//			sum = IntStream.rangeClosed(0, input).filter(i -> i % 2 == 0).sum();
		//		} else
		//			sum = IntStream.rangeClosed(0, input).filter(i -> i % 2 != 0).sum();
		//		System.out.println("결과값: " + sum);
		//		sc.close();
		//		
				// 7번
		try (Scanner sc = new Scanner(System.in)) {
			String strNum = "";
			External: for (;;) {
				int ranNum = (int) ((Math.random() * 100) + 1);
				System.out.println("========================");
				System.out.println("======숫자 맞추기 게임=====");
				System.out.println("========================");
				System.out.println(ranNum);
				Internal: for (;;) {
					System.out.print(">> ");
					strNum = sc.nextLine();
					if (Integer.parseInt(strNum) == ranNum) {
						System.out.println("맞았습니다.");
						System.out.print("게임을 종료 하시겠습니까? (y/n) >> ");
						String strYn = sc.nextLine();
						if (strYn.equals("y") || strYn.equals("Y")) {
							break External;
						} else if (strYn.equals("n") || strYn.equals("N")) {
							break Internal;
						}
					} else if (Integer.parseInt(strNum) > ranNum) {
						System.out.println("더 낮게");

					} else if (Integer.parseInt(strNum) < ranNum) {
						System.out.println("더 높게");
					}
				}
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("게임 종료");
	}

}

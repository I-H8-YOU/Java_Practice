package ch01.sec06;
import java.util.*;
public class SumAvgTest {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] scores = new int[3];
			int num = 0;
			for(int i = 0 ; i < scores.length ; i++) {
				System.out.println("숫자를 입력하세요");
				System.out.print(">> ");
				num = sc.nextInt();
				scores[i] = num;
			}
			int sum = Arrays.stream(scores).sum();
			double avg = Arrays.stream(scores).average().getAsDouble();
			System.out.println("총합 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.println(Arrays.toString(scores));
		}
	}

}

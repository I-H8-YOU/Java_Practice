import java.util.stream.IntStream;
import java.util.*;

public class Problem07 {

	public static void main(String[] args) {
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

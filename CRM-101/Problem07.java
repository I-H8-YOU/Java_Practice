package p1;
import java.util.*;

public class Problem07 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
    				try (Scanner sc = new Scanner(System.in)) {
			String strNum = "";
			Random random = new Random();
			External: for (;;) {
				int ranNum = random.nextInt(100) + 1;
				System.out.println("========================");
				System.out.println("   [숫자 맞추기 게임 시작]");
				System.out.println("========================");
//				System.out.println(ranNum);
				Internal: for (;;) {
					System.out.print(">> ");
					strNum = sc.nextLine();
					try {
				      int chk = Integer.parseInt(strNum);
				    } catch (NumberFormatException e) {
				        System.out.println("숫자만 입력하세요.");
				        continue;
				    }
					if (Integer.parseInt(strNum) == ranNum) {
						System.out.println("맞았습니다.");
						System.out.print("게임을 종료 하시겠습니까? (y/n) >> ");
						String strYn = sc.nextLine();
						if (strYn.equalsIgnoreCase("y")) {
							break External;
						} else if (strYn.equalsIgnoreCase("n")) {
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
		System.out.println("========================");
		System.out.println("   [숫자 맞추기 게임 종료]");
		System.out.println("========================");
    }
}


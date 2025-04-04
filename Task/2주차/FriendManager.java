package p2;

import java.util.*;

public class FriendManager {

	public static void main(String[] args) {
		Friend[] fArr = new Friend[10];
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		while (true) {
			System.out.println("------------------------");
			System.out.println("1.추가 2.목록 3.수정 4.종료 ");
			System.out.println("------------------------");
			System.out.print("선택> ");
			int userInput = Integer.parseInt(sc.nextLine());
			if (userInput == 1) {
				System.out.print("이름 : ");
				String sName = sc.nextLine();
				System.out.print("전화번호 : ");
				String sMobile = sc.nextLine();
				System.out.print("이메일 : ");
				String sEmail = sc.nextLine();
				if (idx == 10) {
					System.out.println("친구 리스트 는 10명이 최대 입니다");
				} else {
					fArr[idx] = new Friend(sName, sMobile, sEmail);
					idx++;
					System.out.println("친구 추가 완료");
				}

			} else if (userInput == 2) {
				Arrays.stream(fArr).filter(f -> f != null).forEach(p -> System.out.println(p.toString()));

			} else if (userInput == 3) {
				System.out.print("이름 : ");
				String sName = sc.nextLine();
				Optional<Friend> fOpt = Arrays.stream(fArr).filter(Objects::nonNull)
						.filter(f -> f.getName().equals(sName)).findFirst(); //첫필터로 배열의 null값을 잘라 NPE를 예방
				if (fOpt.isPresent()) {
					Friend friend = fOpt.get();
					System.out.print("전화번호 : ");
					String sMobile = sc.nextLine();
					System.out.print("이메일 : ");
					String sEmail = sc.nextLine();
					friend.setAll(sName, sMobile, sEmail);
					System.out.println("수정 완료");
				} else {
					System.out.println("그런이름의 친구는 없습니다");
				}

			} else if (userInput == 4) {
				System.out.println("시스템 종료");
				break;
			} else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}

}

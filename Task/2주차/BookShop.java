package p2;

import java.util.*;

public class BookShop {

	public static void main(String[] args) {
		BookShop bs = new BookShop();
		ArrayList<Book> bList1 = bs.getIns();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Iterator ir = bList1.iterator();
			System.out.print("대여하고 싶은 책의 번호를 입력하세요: ");
			int userInput = Integer.parseInt(sc.nextLine());
			if (bList1.stream().anyMatch(m -> m.getBookNo() == userInput)) {
				Book b = bList1.get(userInput - 1);
				b.rent();
			} else {
				System.out.println("없는 책 번호 입니다");
			}
			System.out.println("*****도서 정보 출력하기*****");
			while (ir.hasNext()) {
				Book b = (Book) ir.next();
				b.print();
			}

		}
	}

	public ArrayList<Book> getIns() {
		ArrayList<Book> bList = new ArrayList<>();
		Book b1 = new Book(1, "트와일라잇", "스테파니마이어");
		Book b2 = new Book(2, "뉴문", "스테파니마이어");
		Book b3 = new Book(3, "이클립스", "스테파니마이어");
		Book b4 = new Book(4, "브레이킹던", "스테파니마이어");
		Book b5 = new Book(5, "아리랑", "조정래");
		Book b6 = new Book(6, "젊은그들", "김동인");
		Book b7 = new Book(7, "이프니깐 청춘이다", "김난도");
		Book b8 = new Book(8, "귀천", "천상병");
		Book b9 = new Book(9, "태백산맥", "조정래");
		Book b10 = new Book(10, "풀하우스", "원수연");
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		bList.add(b4);
		bList.add(b5);
		bList.add(b6);
		bList.add(b7);
		bList.add(b8);
		bList.add(b9);
		bList.add(b10);
		return bList;
	}
}

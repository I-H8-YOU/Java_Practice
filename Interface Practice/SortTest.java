package test;
import java.io.IOException;
public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 입력하세요==> B H Q");
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new Bubble();
		}
		else if(ch == 'H' || ch == 'h') {
			sort = new Heap();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort = new Quick();
		}
		int[] arr = new int[] {1,2,3,4,5};
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}

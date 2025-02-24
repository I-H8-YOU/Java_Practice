package test;

public class Bubble implements Sort {

	@Override
	public void ascending(int[] list1) {
		System.out.println("Bubble ascending");
		
	}

	@Override
	public void descending(int[] list1) {
		System.out.println("Bubble descending");
		
	}

	@Override
	public void description() {
		System.out.println("Bubble 정렬입니다.");
		
	}

}

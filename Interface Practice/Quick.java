package test;

public class Quick implements Sort {

	@Override
	public void ascending(int[] list1) {
		System.out.println("Quick ascending");
		
	}

	@Override
	public void descending(int[] list1) {
		System.out.println("Quick descending");
		
	}

	@Override
	public void description() {
		System.out.println("Quick 정렬입니다.");
		
	}
	
}

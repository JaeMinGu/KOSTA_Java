public class Calculator {
	
	/** 메소드 오버로딩 (중복정의) */
	public static int sum(int x, int y) {
		return x + y; 
	}
	
	
	public static double sum(double x, double y) {
		return x + y;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Calculator.sum(4, 3));
		System.out.println(sum(1, 2));
		System.out.println(sum(78.4, 45.8));
		
		
	}
	
	
	

}

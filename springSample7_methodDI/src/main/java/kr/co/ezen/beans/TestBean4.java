package kr.co.ezen.beans;

public class TestBean4 {

	public TestBean4() {
		System.out.println("생성자4 입니다.~");
	}
	
	public void testBean4_init() {
		System.out.println("생성자 호출 이후에 자동으로 호출됩니다.");		 
	}
	
	public int Adder(int x, int y) {
		int sum = x + y;
		
		return sum;
	}
	
	
	public int multi(int x, int y) {
		int sum = x * y;
		
		return sum;
	}
	
	public double divi(double x, Double y) {
		double sum = x / y;
		
		return sum;
	}
		
}

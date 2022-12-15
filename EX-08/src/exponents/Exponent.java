package exponents;

public class Exponent {
	public static double exp(int x, int y) {
		if(y < 0) {
			return exp(x,y+1)/x;
		}
		else if(y == 0) {
			return 1;
		}
		else {
			return exp(x,y-1)*x;
		}
	}
	public static int uExp(int x, int y) {
		if(y <= 0) return 1;
		return uExp(x,y-1)*x;
	}
	
	public static void testExp(int x, int y) {
		System.out.println(
				String.format("%d^%d = %f", x,y,exp(x,y)));
	}
	public static void testUExp(int x, int y) {
		System.out.println(
				String.format("%d^%d = %d", x,y,uExp(x,y)));
	}
	
	public static void main(String[] args) {
		testExp(2,3);
		testExp(5,0);
		testExp(3,-4);
		
		testUExp(2,3);
		testUExp(5,0);
		testUExp(3,-4);
	}
}

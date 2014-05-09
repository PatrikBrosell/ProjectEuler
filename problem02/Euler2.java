public class Euler2 {

	public Euler2() {
	}

	public static void main(String[] args) {
		int sum = 0;
		int f = 0;
		int n = 0;

		while(f < 4000000) {
			n++;
			f = fib(n);
			if(f%2 == 0) {
				sum = sum + f;
			}
		}
		System.out.println(sum);
	}

	public static int fib(int n) {

		if(n <= 2) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
}

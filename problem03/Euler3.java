public class Euler3 {
	public Euler3() {
	}

	public static void main(String[] args) {
		long n = 600851475143L;
		int factor = 2;
		int lastFactor = 1;
		while (n > 1) {
			if (n%factor == 0) {
				lastFactor = factor;
				n = n/factor;
				while (n%factor == 0) {
					n = n/factor;
				}
			}
			factor = factor+1;
		}
		System.out.println(lastFactor);

	}
}

public class Euler12 {
	public Euler12() {
	}

	public static void main(String [] args) {
		int triangleNumber = 1;
		int a = 1;
		int count = 0;
		while (count <= 500) {
			count = 0;
			a += 1;
			triangleNumber += a;
			int tsqr = (int) Math.sqrt(triangleNumber);
			for (int i = 1; i <= tsqr; i++) {
				if (triangleNumber % i == 0) {
					count += 2;
				}
				if (triangleNumber == tsqr * tsqr) {
					count--;
				}
			}
		}
		System.out.println(triangleNumber);

	}
}

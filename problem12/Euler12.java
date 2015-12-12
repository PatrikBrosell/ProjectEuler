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
			for (int i = 1; i <= triangleNumber; i++) {
				if(triangleNumber % i == 0) {
					count++;
				}
			}
		}
		System.out.println(triangleNumber);

	}
}

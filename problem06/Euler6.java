public class Euler6 {
	public Euler6() {
	}

	public static void main(String[] args) {
		int sqsum = 0;
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum+i;
			sqsum = sqsum+ (int) Math.pow(i, 2);
		}
		System.out.println(sum);
		System.out.println(sqsum);
		System.out.println((int) Math.pow(sum, 2) - sqsum);
	}

}

public class Euler1 {

	public Euler1() {
	}

	public static void main(String[] args) {
		int total = 0;
		for(int i = 0; i < 1000; i++) {
			if(isMultipleOfThree(i) || isMultipleOfFive(i)) {
				total = total + i;
			}
		}


		System.out.println(total);
	}

	private static boolean isMultipleOfThree(int n) {
		return n%3 == 0;
	}

	private static boolean isMultipleOfFive(int n) {
		return n%5 == 0;
	}

}

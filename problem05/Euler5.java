public class Euler5 {
	public Euler5 () {
	}

	public static void main(String[] args) {
		long n = 0;
		boolean done = false;
		while(!done) {
			n++;
			int counter = 0;
			for(int i = 1; i <= 20; i++) {
				if(n%i == 0) {
					counter++;
				}
			}
			if (counter == 20) {
				done = true;
			}
		}
		System.out.println(n);

	}
}

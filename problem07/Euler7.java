public class Euler7 {
	public Euler7() {
	}

	private static boolean isPrime(int n) {
		if (n==1) {
			return false;
		}
		else if (n<4) {
			return true;
		}
		else if (n%2==0) {
			return false;
		}
		else if (n<9) {
			return true;
		}
		else if (n%3==0) {
			return false;
		} else {
			int r = (int) Math.floor(Math.sqrt(n));
			int f = 5;
			while (f <= r) {
				if(n%f==0) {
					return false;
				}
				if(n%(f+2)==0) {
					return false;
				}
				f = f + 6;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		int counter = 1;
		int prime = 1;
		while(counter <= 10001) {
			prime++;
			if(isPrime(prime)) {
				counter++;

			}
		}
		System.out.println(prime);
	}

}

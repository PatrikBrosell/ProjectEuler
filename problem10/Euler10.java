public class Euler10 {
	public Euler10() {
	}

	public static boolean isPrime(int n) {
		if (n==1) {
			return false;
		}
		else if (n<4) {
			return true;
		}
		else if(n%2==0) {
			return false;
		}
		else if(n<9) {
			return true;
		}
		else if(n%3==0) {
			return false;
		} else {
			int r = (int) Math.floor(Math.sqrt(n));
			int f = 5;
			while(f <= r) {
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
		long sum = 5; //2 and 3 are prime
		int prime = 5;
		while(prime <= 2000000) {
			if(isPrime(prime)) {
				sum = sum + prime;
			}
			prime = prime + 2;
		}
		System.out.println(sum);
	}
}

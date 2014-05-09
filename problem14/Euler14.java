
public class Euler14 {

	public Euler14() {
		collatz();
	}

	public int collatz() {
		long n = 0;
		int total = 0;
		int totLength = 0;
		int number = 0;
		for(int i = 2; i < 1000000; i++) {
			int length = 1;
			n = i;
			while(n != 1) {
				if (n%2==0) {
					n=n/2;
				} else {
					n=3*n+1;
				}
				length++;
			}
			if (length > totLength) {
				totLength = length;
				number = i;
			}
		}
		System.out.println("Number: " + number + " Length: " + totLength);
		return total;
	}

	public static void main(String[] args) {
		new Euler14();
	}

}

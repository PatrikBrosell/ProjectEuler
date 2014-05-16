public class Euler4 {
	public Euler4() {
	}

	private static int reverse(int n) {
		int reversed = 0;
		while (n > 0) {
			reversed = 10*reversed + n%10;
			n = n/10;
		}
		return reversed;
	}

	private static boolean isPalindrome(int n) {
		return n == reverse(n);
	}


	public static void main(String[] args) {
		int largest = 0;
		int a = 100;
		while (a <= 999) {
			int b = 100;
			while (b <= 999) {
				if (isPalindrome(a*b) && a*b > largest) {
					largest = a*b;
				}
				b++;
			}
			a++;
		}
		System.out.println(largest);
	}

}

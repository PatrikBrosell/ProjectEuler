import java.math.*;
import java.util.ArrayList;

public class Euler25 {
	private BigInteger big;
	private ArrayList<BigInteger> memo;

	public Euler25() {
		int n = 0;
		int length = 0;
		BigInteger number = new BigInteger("0");
		memo = new ArrayList<BigInteger>();
		while(length < 1000) {
			n++;
			for(int i = memo.size(); i <= n; i++) {
				memo.add(new BigInteger("-1"));
			}
			number = fib(new BigInteger(Integer.toString(n)));
			length = number.toString().length();
		}

		System.out.println("Length: " + length + " Number: " + n);
	}


	public BigInteger fib(BigInteger n) {
		if( memo.get(n.intValue()).compareTo(new BigInteger("-1")) != 0) {
			return memo.get(n.intValue());
		}
		if(n.intValue() <= 2) {
			big = new BigInteger("1");
		} else {
			big = fib(n.subtract(new BigInteger("1"))).add(fib(n.subtract(new BigInteger("2"))));
		}
		memo.set(n.intValue(), big);
		return big;
	}

	public static void main(String[] args) {
		new Euler25();
	}
}

import java.math.BigInteger;

public class Euler16 {

	public static void main(String[] args) {
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);
		String numberString = number.toString();
		int sum = 0;
		for (int i = 0; i < numberString.length(); i++) {
			sum += Integer.parseInt(numberString.substring(i, i+1));
		}
		System.out.println(sum);
	}
}

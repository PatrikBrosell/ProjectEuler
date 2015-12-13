import java.util.ArrayList;

public class Euler17 {


	public static void main(String[] args) {
		String[] ones = {"one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine"};

		String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen",
			 "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

		String[] tens = {"twenty", "thirty", "fourty", "fifty", "sixty",
			 "seventy", "eighty", "ninety"};

		ArrayList<String> oneto99 = new ArrayList<String>();
		for (int i = 0; i < ones.length; i++) oneto99.add(ones[i]);
		for (int i = 0; i < teens.length; i++) oneto99.add(teens[i]);
		for (int i = 0; i < tens.length; i++) {
			oneto99.add(tens[i]);
			for (int j = 0; j < ones.length; j++) oneto99.add(tens[i]+ones[i]);
		}
		ArrayList<String> oneto999 = new ArrayList<String>();
		oneto999.addAll(oneto99);
		for (int i = 0; i < ones.length; i++) {
			oneto999.add(ones[i]+"hundred");
			for (int j = 0; j < oneto99.size(); j++) {
				oneto999.add(ones[i]+"hundredand"+oneto99.get(j));
			}
		}
		int sum = "onethousand".length();
		for (String s : oneto999) sum += s.length();
		System.out.println(sum);
	}
}

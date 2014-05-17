public class Euler10 {
	public Euler10() {
	}

	public static void main(String[] args) {
		for(int a = 1; a < 1000; a++) {
			for(int b = 2; b < 1000; b++) {
				for(int c = 2; c < 1000; c++) {
					if(a+b+c==1000) {
						if(Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)) {
							System.out.println(a*b*c);
							System.exit(0);
						}
					}
				}
			}
		}
	}
}

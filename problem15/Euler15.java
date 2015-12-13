import java.math.BigInteger;

public class Euler15 {
	public Euler15() {

	}

	public static void main(String[] args) {
		int m = 20;
		int n = 20;
		BigInteger[][] grid = new BigInteger[m+1][n+1];

		for (int i = 0; i <= m; i++) {
			grid[i][0] = new BigInteger("1");
		}
		for (int j = 0; j <= n; j++) {
			grid[0][j] = new BigInteger("1");
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				grid[i][j] = grid[i-1][j].add(grid[i][j-1]);
			}
		}
		System.out.println(grid[m][n]);
	}
}

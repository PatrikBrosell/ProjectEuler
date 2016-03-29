#include <stdio.h>
#include <stdlib.h>



typedef struct sudokuGrid {
	int grid[9][9];
} sudokuGrid;


int checkcolumn(sudokuGrid** grd, int col, int num) {
	int row;
	for (row = 0; row < 9; row++) {
		if((*grd)->grid[row][col] == num) {
			return 0;
		}
	}
	return 1;
}

int checkrow(sudokuGrid** grd, int row, int num) {
	int col;
	for (col = 0; col < 9; col++) {
		if((*grd)->grid[row][col] == num) {
			return 0;
		}
	}
	return 1;
}

int checkgrid(sudokuGrid** grd, int row, int col, int num) {
	row = (row/3)*3;
	col = (col/3)*3;
	int r, c;
	for (r = 0; r < 3; r++) {
		for (c = 0; c < 3; c++) {
			if ((*grd)->grid[row + r][col + c] == num) {
			return 0;
			}
		}
	}
	return 1;
}

int available(sudokuGrid** grd, int row, int col, int num) {
	int a = checkcolumn(grd, col, num);
	int b = checkrow(grd, row, num);
	int c = checkgrid(grd, row, col, num);
	return a && b && c;
}


int readFile(sudokuGrid* grd, FILE* fp) {
//	FILE*	fp = fopen("sudoku.txt", "r");
	char	ch;
	int	i = 0;
	int	j = 0;

	while ( (ch = fgetc(fp)) != EOF )
	{
		// rubriken "Grid XX"
		// skippa den
		if ( ch == 'G') {
			while ( (ch = fgetc(fp))  != '\n') {
			}
			ch = fgetc(fp);
		}

		if ( (ch - '0' < 10) && (ch - '0' > -1) )
		{
			grd->grid[i][j] = ch - '0';
			j++;
		}

		if (i == 9 && j == 10) {
			return 0;
		}
		if ( j == 9 ) {
			j = 0;
			i++;
		}
	}

//	fclose(fp);
	return 0;
}


int printGrid ( sudokuGrid** grd ) {
	int i = 0;
	int j = 0;
	for (i = 0; i != 9; i++) {
		for (j = 0; j != 9; j++) {
			printf("%d", (*grd)->grid[i][j]);
		}
		printf("\n");
	}
	return 0;
}

int solve( sudokuGrid** grd, int row, int col) {
	if (row > 8 || col > 8) {
		return 1;
	}
	// hoppa till nästa
	if ((*grd)->grid[row][col] != 0) {
		if (col < 8) {
			return solve(grd, row, col+1);
		} else {
			return solve(grd, row + 1, 0);
		}
	} else {
		int ctr;
		for (ctr = 1; ctr <= 9; ctr++) {
			if (available(grd, row, col, ctr)) {
				(*grd)->grid[row][col] = ctr;
				if (col < 8) {
					if (solve(grd, row, col+1)) return 1;
					else (*grd)->grid[row][col] = 0;
				} else {
					if (solve(grd, row + 1, 0)) return 1;
					else (*grd)->grid[row][col] = 0;
				}
			}
		}
	}
	return 0;
}

int getTopLeftNumbers( sudokuGrid* grd)
{
	int a = 0;
	a += grd->grid[0][0] * 100;
	a += grd->grid[0][1] * 10;
	a += grd->grid[0][2] * 1;
	return a;

}


int main(int argc, char* argv[]) {
	int tot = 0;
	sudokuGrid* grd = malloc(sizeof(sudokuGrid));
	// Läs in ett grid.
	FILE* fp = fopen("sudoku.txt", "r");
	int i = 0;
//	for(i = 0; i < 1; i++) {

		readFile(grd, fp);
		// Lös.
		solve(&grd, 0, 0);
		// Lägg till top left number i en variabel.
		tot += getTopLeftNumbers(grd);
//	}
	printf("\n\n\n");
	printf("%d\n\n", tot);
//	printGrid(&grd);


	fclose(fp);
	free(grd);

	return 0;
}

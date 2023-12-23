public class DungeonGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows And Colum");
		int roww = sc.nextInt();
		int coll = sc.nextInt();

		char[][] game = new char[roww][coll];

		System.out.println("Enter position of Gold");
		int row = sc.nextInt();
		int col = sc.nextInt();
		game[row][col] = 'G';

		System.out.println("Enter position of Adventure");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		game[row1][col1] = 'A';

		System.out.println("Enter position of Monster");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		game[row2][col2] = 'M';

		int steps = Math.abs(row - row1) + Math.abs(col - col1);
		int stepsmon = Math.abs(row - row2) + Math.abs(col - col2);

		int j = col1;

		for (int k = 0; k <= steps; k++) {
			if (j >= steps) {
				row1--;
			}

			if (j >= steps) {
				--j;
			}
			System.out.println(row1 + "," + j);
			j++;
		}

	}
}

    }
}


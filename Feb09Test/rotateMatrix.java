
public class rotateMatrix {

	public static void main(String[] args) {
		// rotate clockwise=>transpose+reverse row-wise
		int[][] matrix = { { 2, 3, 4 }, { 7, 8, 9 }, { 6, 1, 5 } };
		for (int i = 0; i < 3; i++)
			rotate(matrix);

	}

	public static void rotate(int[][] matrix) {
		int temp = 0;
		// printing the original matrix
		System.out.println("original matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		System.out.println();

		swap(matrix);

		// printing the final matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void swap(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (j < (matrix.length / 2)) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[i][(matrix.length - 1) - j];
					matrix[i][(matrix.length - 1) - j] = temp;
				} else
					break;
			}
		}
	}

}

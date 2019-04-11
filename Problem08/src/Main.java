public class Main {
	
	public static void main(String[] args) {
		int[][] matrix = {{1,1,1,0}, {0,5,0,1}, {2,1,3,10}};
		
		System.out.println(matrixElementsSum(matrix));
		System.out.println("Done!");
	}

	static int matrixElementsSum(int[][] matrix) {
		int total = 0;
		for (int rowNumber = matrix.length - 1; rowNumber >= 0; rowNumber--) {
			int[] row = matrix[rowNumber];
			for (int column = 0; column < row.length; column++) {
				if (rowNumber == 0) {
					total += row[column];
				} else {
					boolean ghostAbove = false;
					for (int upperRowNumber = rowNumber - 1; upperRowNumber >= 0; upperRowNumber--) {
						int[] upperRow = matrix[upperRowNumber];
						if (upperRow[column] == 0) {
							ghostAbove = true;
							break;
						}
					}
					if (!ghostAbove) {
						total += row[column];
					}
				}
			}
		}
		return total;

	}

}

public class Main {
	
	public static void main(String[] args) {
		System.out.println(adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
		System.out.println("Done!");
	}

	int adjacentElementsProduct(int[] inputArray) {
	    int largestProduct = Integer.MIN_VALUE;
	    for (int index = 0; index < inputArray.length - 1; index++) {
	        int product = inputArray[index] * inputArray[index + 1];
	        if (product > largestProduct) {
	            largestProduct = product;
	        }
	    }
	    
	    return largestProduct;

	}


}

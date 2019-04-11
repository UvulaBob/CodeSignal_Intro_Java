public class Main {
	
	public static void main(String[] args) {
		System.out.println(shapeArea(5));
		System.out.println("Done!");
	}

	int shapeArea(int n) {
	    int height = (n * 2) - 1;
	    int area = height + (height - 1);
	    for (int blockFillFactor = n - 2; blockFillFactor > 0; blockFillFactor--) {
	        area += blockFillFactor * 4;
	    }
	    
	    return area;
	}

}

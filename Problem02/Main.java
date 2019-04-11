public class Main {
	
	public static void main(String[] args) {
		System.out.println(centuryFromYear(1901));
		System.out.println("Done!");
	}

	int centuryFromYear(int year) {
	    return year / 100 + ((year % 100 == 0) ? 0 : 1);
	}

}

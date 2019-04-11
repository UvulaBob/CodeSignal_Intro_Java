public class Main {
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome("abba"));
		System.out.println("Done!");
	}

	boolean checkPalindrome(String inputString) {
	    StringBuilder sb = new StringBuilder(inputString);
	    sb.reverse();
	    return sb.toString().equals(inputString);
	}

}

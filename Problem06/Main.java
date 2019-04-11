public class Main {
	
	public static void main(String[] args) {
		System.out.println(makeArrayConsecutive2(new int[] {6, 2, 3, 8}));
		System.out.println("Done!");
	}

	int makeArrayConsecutive2(int[] statues) {
	    ArrayList<Integer> statuesList = new ArrayList<>();
	    
	    for (int statue : statues) {
	        statuesList.add(statue);
	    }
	    
	    int statuesNeeded = 0;
	    Collections.sort(statuesList);
	    for (int index = 0; index < statuesList.size() - 1; index++) {
	        statuesNeeded += (statuesList.get(index + 1) - statuesList.get(index)) - 1;
	    }
	    
	    return statuesNeeded;
	}
}

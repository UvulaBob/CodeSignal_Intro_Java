public class Main {
	
	public static void main(String[] args) {
		System.out.println(almostIncreasingSequence(new int[] {1, 3, 2, 1}));
		System.out.println("Done!");
	}

	boolean almostIncreasingSequence(int[] sequence) {
	   if (sequence.length <= 2) {
				return true;
			}

			ArrayList<Integer> sequenceAsArrayList = new ArrayList<>();
			for (int value : sequence) {
				sequenceAsArrayList.add(value);
			}

			boolean itemAlreadyRemoved = false;
			for (int i = 0; i < sequenceAsArrayList.size() - 1; i++) {
				if (sequenceAsArrayList.get(i) >= sequenceAsArrayList.get(i + 1)) {
					if (itemAlreadyRemoved) {
						return false;
					}
					
					if (i == sequenceAsArrayList.size() - 1) {
						continue;
					}
					
					itemAlreadyRemoved = true;
					if (i < sequenceAsArrayList.size() - 2) {
						if (sequenceAsArrayList.get(i) >= sequenceAsArrayList.get(i + 2)) {
							sequenceAsArrayList.remove(i);
							i -= 2;
							if (i < -1) {
								i = -1;
							}
						} else {
							sequenceAsArrayList.remove(i + 1);
						}
					}
				}
			}
			return true;
		}
}

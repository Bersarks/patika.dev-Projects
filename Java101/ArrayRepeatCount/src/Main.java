public class Main {
	static boolean isExist(int[] array, int i) {
		for (int num : array) {
			if (num == i) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
		int[] exists = new int[array.length];
		int count = 0, indexNumber = 0;

		for (int i = 0; i < array.length; i++) {
			if (!isExist(exists, array[i])) {
				exists[indexNumber] = array[i];
				indexNumber++;
				for (int j = 0; j < array.length; j++) {
					if (array[i] == array[j]) {
						count++;
					}
				}
				System.out.println(array[i] + " Sayısı " + count + " kere tekrar edildi.");
				count = 0;
			}
		}
	}
}

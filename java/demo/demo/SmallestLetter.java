package demo.demo;

public class SmallestLetter {

	public static void main(String[] args) {

		char arr[] = { 'c', 'f', 'j' };
		char target = 'c';
		char result = binarySearch(arr, target);
		System.out.println(result);
	}

	static char binarySearch(char[] arr, char target) {

		int s = 0, e = arr.length - 1;
		while (s <= e) {
			int mid = s + (e - s) / 2;

			if (target < arr[mid]) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}

		}
		return arr[s % arr.length];
	}

}

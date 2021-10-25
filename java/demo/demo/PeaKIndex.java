package demo.demo;

public class PeaKIndex {

	public static void main(String[] args) {

		int arr[] = { -6, -3, -1, 1, 3, 5, 6, 7, 9, 10, 59, 60, 100, 101, 99, 50, 20, 10, -1 };
		

		int result = binarySearch(arr);
		System.out.println(result);
	}

	static int binarySearch(int[] arr) {
		int s = 0, e = arr.length - 1;
		
		while (s < e) {
			int mid = s + (e - s) / 2;

			if (arr[mid + 1] < arr[mid]) {
				e = mid;
			} else {// if (arr[mid + 1] > arr[mid]) {
				s = mid + 1;
			}
			
		}
		return arr[s];
	}

}

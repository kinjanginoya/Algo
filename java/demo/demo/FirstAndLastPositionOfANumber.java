package demo.demo;

public class FirstAndLastPositionOfANumber {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 9 };
		int target = 7;
		int result[] = searchRange(arr, target);
		System.out.println(result[0] + ", " + result[1]);
	}

	static int[] searchRange(int[] arr, int target) {
		int ans[] = { -1, -1 };
		ans[0] = search(arr, target, true);
		if (ans[0] != -1)
			ans[1] = search(arr, target, false);

		return ans;
	}

	static int search(int[] arr, int target, boolean findStartIndex) {

		int ans = -1;
		int s = 0, e = arr.length - 1;

		while (s <= e) {
			int mid = s + (e - s) / 2;
			if (target < arr[mid]) {
				e = mid - 1;
			} else if (target > arr[mid]) {
				s = mid + 1;
			} else {
				ans = mid;
				if (findStartIndex == true) {
					e = mid - 1;
				} else {
					s = mid + 1;
				}
			}

		}
		return ans;

	}

}

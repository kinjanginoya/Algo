package demo.demo;

public class SearchInRotationArray {

	public static void main(String[] args) {

		// int arr[] = { 3, 5, 6, 7, 9, 10, 59, 60, 100, 101, -6, -1, 1, 2 };
		int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 1;
		int s = 0, e = 0;
		int result = Pivot(arr);
		System.out.println(result);
		if (arr[result] >= target && arr[0] < target) {
			s = 0;
			e = result;
		} else {
			s = result + 1;
			e = arr.length - 1;
		}
		int index = binarySearch(arr, target, s, e);
		System.out.println(index);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		int s = start, e = end;

		while (s <= e) {
			int mid = s + (e - s) / 2;

			if (target < arr[mid]) {
				e = mid - 1;
			} else if (target > arr[mid]) {
				s = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

	static int Pivot(int[] arr) {
		int s = 0, e = arr.length - 1;

		while (s <= e) {
			int mid = s + (e - s) / 2;

			if (mid < e && arr[mid + 1] < arr[mid]) {
				return mid;
			}

			if (mid > s && arr[mid - 1] > arr[mid]) {
				return mid;
			}
			if (arr[mid] == arr[s] && arr[mid] == arr[e]) {

				if (arr[s] > arr[s + 1]) {
					return s;
				}
				s++;
				if (arr[e] < arr[e - 1]) {
					return e;
				}
				e--;
			} else if (arr[s] < arr[mid] || (arr[s]) == arr[mid] && arr[mid] > arr[mid + 1]) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return -1;
	}

}

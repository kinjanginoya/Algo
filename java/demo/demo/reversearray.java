package demo.demo;

import java.util.Scanner;

/**
 * reversearray
 */
public class reversearray {

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 27, 53 };
		// 53 ,27 3 5 1
		System.out.println("enter the nth position:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		System.out.println(a[n]);
	}
}
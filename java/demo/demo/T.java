package demo.demo;

import java.util.Scanner;

public class T {

	public static void main(String[] args) throws Exception {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in,
		 * "UTF-8")); String name = br.readLine(); System.out.println(name);
		 */

		/*
		 * Scanner s = new Scanner(System.in); String name = s.nextLine();
		 * System.out.println(name);
		 */
		int co = 0;
		/*
		 * for (int i = 0; i < name.length(); i++) { if
		 * (Character.isWhitespace(name.charAt(i))) { co++; } }
		 */
		System.out.println(co);

		System.out.println(rec(3));
		System.out.println(rec(4));
		System.out.println(rec(5));

		System.out.println(rec(6));

	}

	public static int rec(int n) {
		if (n > 0) {
			if (n == 1) {
				return 1;
			}
			if (n > 1) {
				return (n * rec(n - 1));
			}
		}
		return 1;

	}

}

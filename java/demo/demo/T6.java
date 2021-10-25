package demo.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T6 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int no = Integer.parseInt(sc.nextLine());
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < no; i++) {
			String[] sa = sc.nextLine().split(":");
			String result = evalvate(sa);
			list.add(result);
		}
		System.out.println(no);
		System.out.println(list);

	}

	private static String evalvate(String[] sa) {
		if (null != sc) {
			int total = Integer.parseInt(sa[1]) + Integer.parseInt(sa[2]) + Integer.parseInt(sa[3])
					+ Integer.parseInt(sa[4]) + Integer.parseInt(sa[5]);
			if (total > 400 && total < 500) {
				return sa[0] + ":O";
			} else if (total > 300 && total < 400) {
				return sa[0] + ":A";
			} else if (total > 250 && total < 300) {
				return sa[0] + ":B";
			} else if (total > 200 && total < 250) {
				return sa[0] + ":C";
			} else if (total > 0 && total < 200) {
				return sa[0] + ":E";
			}

		} else {
			return "Invalid Input";
		}
		return null;

	}

}

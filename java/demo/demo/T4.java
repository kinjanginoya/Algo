package demo.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T4 {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);

		for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			if (integer == 2) {
				iterator.remove();
				// integers.add(6);

			}
		}

		System.out.println(integers);
	}

}

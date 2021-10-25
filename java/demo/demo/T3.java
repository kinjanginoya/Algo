package demo.demo;

import java.awt.peer.SystemTrayPeer;
import java.util.HashSet;
import java.util.Set;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < s.length(); i++) {
			if (set.size() == 0) {
				set.add(Character.toString(s.charAt(i)));
			} else {
				if (set.contains(Character.toString(s.charAt(i)))) {
					System.out.println(s.charAt(i));
				} else {
					// System.out.print("Else ==>" + s.charAt(i));
					set.add(Character.toString(s.charAt(i)));
				}

			}
		}
		// System.out.println(set);

	}

}

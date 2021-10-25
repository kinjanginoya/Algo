package demo.demo;

public class T2 {

	public static void main(String[] args) {

		String expr = "racecyar";
		int n = expr.length();
		int i = 0;
		boolean flag = false, onces = true;
		while (i < (expr.length() / 2)) {

			if (Character.toString(expr.charAt(i)).equals(Character.toString(expr.charAt(n - 1)))) {
				i++;
				n--;
				flag = true;
				// System.out.println("true");
			} else {
				if (onces) {
					expr = expr.replace(Character.toString(expr.charAt(i)), "");

					onces = false;
					i++;
				} else {
					flag = false;
					break;
				}
			}

		}
		System.out.println(expr);
		System.out.println(flag);
	}

	public boolean checkPalindrome(String expr) {
		return false;

	}
}

class Solution {
   public static boolean isPalindrome(String s) {
		String a = s.replaceAll("[^a-zA-Z0-9]", "");
		a = a.toLowerCase();
		String c = a.substring(0, ((a.length() / 2)));
		String b = a.substring((a.length() / 2), a.length());
		StringBuffer sb = new StringBuffer(b);
		String d = sb.reverse().toString();
		if (a.length() % 2 == 1) {
			d = d.substring(0, d.length()-1);
		}

		if (d.equals(c)) {
			return true;
		} else {
			return false;
		}
	}
}

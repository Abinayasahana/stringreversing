package stringreversing;

public interface StringReverser {

	public static StringBuffer reverseString(String str) {
		StringBuffer s = new StringBuffer();
		s.append(str);
		s.reverse();
		return s;
	}

	public static String reverseStr(String str) {
		String reverse = "";
		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseStr(str.substring(0, str.length() - 1));
			return reverse;
		}
	}
}

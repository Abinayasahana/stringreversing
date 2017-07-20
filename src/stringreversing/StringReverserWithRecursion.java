package stringreversing;

public abstract class StringReverserWithRecursion implements StringReverser {
	String reverse = "";

	public String reverseStringWithRecursion(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseStringWithRecursion(str.substring(0, str.length() - 1));
			return reverse;
		}
	}
}

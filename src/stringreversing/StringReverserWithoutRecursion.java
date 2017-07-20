package stringreversing;

public abstract class StringReverserWithoutRecursion implements StringReverser {
	String str;

	public StringBuffer reverseString(String str) {
		this.str = str;
		StringBuffer s = new StringBuffer();
		s.append(str);
		s.reverse();
		return s;
	}

}

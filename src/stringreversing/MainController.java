package stringreversing;

public class MainController {
	public static void main(String args[]) {
		// local variables for storing input and expected output
		String case1 = "Hello world";
		String case2 = "This is a test.";
		String case3 = "abc def";
		String expected1 = "dlrow olleH";
		String expected2 = ".tset a si sihT";
		String expected3 = "fed cba";

		// perform the operations and get the actual results
		long start = System.currentTimeMillis();

		String result1 = StringReverser.reverseStr(case1);
		String result2 = StringReverser.reverseStr(case2);
		String result3 = StringReverser.reverseStr(case3);
		long stop = System.currentTimeMillis();
		long start2 = System.currentTimeMillis();
		StringBuffer result4 = StringReverser.reverseString(case1);
		StringBuffer result5 = StringReverser.reverseString(case2);
		StringBuffer result6 = StringReverser.reverseString(case3);
		long stop2 = System.currentTimeMillis();
		System.out.println("Run time for recursion " + (stop - start) + "ms");
		System.out.println("Run time for without recursion " + (stop2 - start2) + "ms");

		// verify if the tests pass or fail
		if (result1.equals(expected1))
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result2.equals(expected2))
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result3.equals(expected3))
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result4.equals(expected1))
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result5.equals(expected2))
			System.out.println("pass");
		else
			System.out.println("fail");
		if (result6.equals(expected3))
			System.out.println("pass");
		else
			System.out.println("fail");
		System.out.println("program is completed");

	}
}

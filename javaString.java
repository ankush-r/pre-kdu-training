import java.util.*;

public class javaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String second = sc.next();
		int len1 = first.length();
		int len2 = second.length();
		System.out.println("The length of the first string is " + len1);
		System.out.println("The length of the second string is " + len2);
		if (len1 != len2) {
			System.out.println("The length of the two strings is not same");
			System.out.println("Two strings are not equal");
		} else {
			System.out.println("The length of the two strings is same");
			if (first.equals(second)) {
				System.out.println("Two strings are equal");
			} else {
				System.out.println("Two strings are not equal");

			}
		}
	}
}
package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicateCharactersInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.nextLine();
		scanner.close();
		char[] ca = str.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (Character c : ca) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);

			}
		}
		// printing duplicate characters
		for (Character c : m.keySet()) {
			if (m.get(c) > 1) {
				System.out.println("Character " +c+ "  is repeated " + m.get(c) + " times");
			}

		}

	}

}

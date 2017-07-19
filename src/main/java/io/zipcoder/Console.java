package io.zipcoder;

import java.util.Scanner;

public class Console {

	private static final Scanner scanner = new Scanner(System.in);

	public static void println(String string) {
		System.out.println(string);
	}

	public static String getStringInput(String string) {
		println(string);
		String input = scanner.nextLine();
		return input;

	}

	public static int getIntInput(String string) {
		println(string);
		int input = scanner.nextInt();
		return input;

	}

}

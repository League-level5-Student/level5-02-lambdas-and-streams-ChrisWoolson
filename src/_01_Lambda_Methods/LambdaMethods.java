package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((z) -> {
			String t = "";
			for (int i = z.length(); i > 0; i--) {

				t += z.substring(i - 1, i);

			}
			System.out.println(t);

		}, "String");

		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		printCustomMessage((r) -> {
			String t2 = "";
			for (int i = 0; i < r.length(); i++) {
				if (i % 2 == 0) {
					t2 += r.substring(i, i + 1).toUpperCase();
				} else {
					t2 += r.substring(i, i + 1).toLowerCase();
				}
			}
			System.out.println(t2);

		}, "Mixed");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((y) -> {
			String f = "";
			for (int i = 0; i < y.length(); i++) {
				f += y.substring(i, i + 1);
				f += ".";
			}

			System.out.println(f);

		}, "period");

		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		
		printCustomMessage((h)->{
		//
		//	
			//
		//
		},"vowel");
		
		
		
		
		
		

	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}

package MyQuestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RomanNumerals {

	private static int input;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			input = sc.nextInt();
		}catch(InputMismatchException ex) {
			System.out.println("Supposed to enter only integers");
			System.exit(0);
		}

		try {
			String output = intToRoman(input);
			System.out.println("Roman number:" + output);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String intToRoman(int number) throws Exception{
		StringBuilder result = new StringBuilder();
		int[] values = new int[] { 1000, 900, 500, 400, 100,90, 50, 40, 10, 9, 5, 4, 1 };
		String[] numerals = new String[]
		    { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		if (number < 0 || number > 3999)
		    throw new Exception("Value must be in the range 0 - 3,999.");
		if (number == 0) 
			return "N";
		
		for (int i = 0; i < 13; i++)
		{
		    // If the number being converted is less than the test value, append
		    // the corresponding numeral or numeral pair to the resultant string
		    while (number >= values[i])
		    {
		        number -= values[i];
		        result.append(numerals[i]);
		    }
		}
		return result.toString();
	}
}
	

/*
 * Zach Hein
 * This program is my integration project for COP 2006 and it will include all the skills that I have learned throughout the course.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		name nameObject = new name ();
		
		System.out.println("Enter your name here:");
		String yourName = input.nextLine();
		
		nameObject.inputMessage(yourName);
		
		
		System.out.println("Hello " + yourName + ", this is Zach Hein's Integration Project.");
		
		/*
		 * Java built-in data types:
		 * 	byte: an 8-bit signed two's complement integer. It's minimum value is -128 and its maximum value is 127 (inclusive)
		 * 	short: a 16-bit signed two's complement integer. It's minimum value is -32,768 and it's maximum value is 32,767 (inclusive)
		 * 	int: a 32-bit signed two's complement integer. It's minimum value is -2^31 and it's maximum value is (2^31)-1 (inclusive)
		 * 	long: a 64-bit two's complement integer. It's minimum value is -2^63 and it's maximum value is (2^63)-1 (inclusive)
		 * 	float: a single-precision 32-bit IEEE 754 floating point. It is used for long floating arrays and not for precise numbers or values
		 * 	double: a double-precision 64-bit IEEE 754 floating point. It is used for decimal numbers
		 * 	boolean: has only two possible values that are true and false
		 * 	char: a single 16-bit Unicode character. It's minimum value is 0 and it's maximum value is 65,535 (inclusive)
		 */
		
		
		/*
		 * Variable is a location in memory.
		 * Scope is the section of code that a variable is able to be accessed in.
		 * Final causes the variable to never be able to change and this value will always be set for that variable.
		 */
		final int integer1 = 1;
		System.out.println("Int is equal to " + integer1 + ".");
		double decimal1 = 1.5;
		System.out.println("Double is equal to " + decimal1 + ".");
		String word1 = "String is equal to a word or sentence.";
		System.out.println(word1);
		
		
		
		
		/*
		 * word2 is word1 but it created it using all lower case by using .toLowerCase.
		 * word3 is word1 but it created it using all upper case by using .toUpperCase.
		 * .compareTo compares two strings lexicographically leading the line of code to print 0 since they are equal lexicographically.
		 */
		String word2;
		word2 = word1.toLowerCase();
		System.out.println(word2);
		String word3;
		word3 = word1.toUpperCase();
		System.out.println(word3);
		
		System.out.println(word1.compareTo("String is equal to a word or sentence."));
		
		
		
		/*
		 * The \" escape sequence allows me to place quotations inside quotations inside of a print statement.
		 */
		System.out.println("When she spoke she said \"Where's the food!\".");
		
		
		/*
		 * Casting is the ability to convert a previously declared variable data type to a different data type.
		 */
		double castEx1 = 10;
		int castEx2;
		castEx2 = (int) castEx1;
		System.out.println(castEx2 + " is the int version of castex1.");
		
		
		/*
		 * I used Random to generate 3 numbers in between 1 and 6.
		 * I added the random number generated to Math.PI to get a seperate answer.
		 */
		Random dice = new Random();
		int roll;
		
		for(int counter=1; counter<=3; counter++) {
			roll = 1+dice.nextInt (6);
			System.out.println(roll + " + PI =");
			System.out.println(roll + Math.PI);
		}
		
		
		/*
		 * This if statement asks the user to input a number and if the number is positive it will output a different phrase than if the number is negative.
		 */
		System.out.println("Enter a number here:");
		int number = input.nextInt();
		double answer;
		answer = number;
		if (number >= 0) {
			System.out.println(answer + " is a positive number.");
			
		} else if (number < 0 ) {
			System.out.println(answer + " is a negative number.");
		}
		
		/*
		 * This is a ternary operator used to tell the user what the largest number they entered is.
		 */
		System.out.println("Enter first number here:");
		double ternaryNumber1 = input.nextDouble();
		System.out.println("Enter second number here:");
		double ternaryNumber2 = input.nextDouble();
		double ternaryAnswer = ((ternaryNumber1 > ternaryNumber2) ? ternaryNumber1 : ternaryNumber2);
		System.out.println(ternaryAnswer + " is the largest number you entered.");
		
		/*
		 * This switch statement will ask the user to input their birth month number and it will output what their birth month is.
		 * Break exits your from the loop early.
		 */
		System.out.println("Enter birth month number here :");
		int birthMonth = input.nextInt();
		String month;
		switch (birthMonth) {
			case 1:  month = "January";
				break;
			case 2:  month = "February";
				break;
			case 3:  month = "March";
				break;
			case 4:  month = "April";
				break;
			case 5:  month = "May";
				break;
			case 6:  month = "June";
				break;
			case 7:  month = "July";
				break;
			case 8:  month = "August";
				break;
			case 9:  month = "September";
				break;
			case 10: month = "October";
				break;
			case 11: month = "November";
				break;
			case 12: month = "December";
				break;
			default: month = "Invalid month";
				break;
		}
		System.out.println("You were born in " + month + ".");
		
		/*
		 * The == operator checks if two values are equal to each other and if their aren't it will output false.
		 */
		System.out.println("Enter two equal numbers.");
		System.out.println("Enter first number here :");
		double compareNumber1 = input.nextDouble();
		System.out.println("Enter second number here :");
		double compareNumber2 = input.nextDouble();
		System.out.println(compareNumber1 == compareNumber2);
		
		/*
		 * This block of code asks the user to enter two values and then it adds, multiplies, subtracts, and divides the two values, as well as finding the remainder of a division problem.
		 * The ++ operator increments the value by one.
		 * Operator precedence is the PEMDAS version for java. Multiplication and division go before addition and subtraction unless overruled by parenthesis.
		 */
		System.out.println("Enter first number here :");
		double operatorsNumber1 = input.nextDouble();
		System.out.println("Enter a second number smaller than the first, here :");
		double operatorsNumber2 = input.nextDouble();
		System.out.println((((operatorsNumber1 + operatorsNumber2)*5)-5)/2);
		System.out.println(operatorsNumber1 % operatorsNumber2 + " : This number is whatever the remainder is of the first number divided by the second.");
		double operatorsNumberPlusPlus = ++operatorsNumber1;
		System.out.println(operatorsNumberPlusPlus + ": This is your first value entered + 1.");
		double operatorsNumberMinusMinus = --operatorsNumber1;
		System.out.println(operatorsNumberMinusMinus + ": This is your first value entered + 1 then - 1.");
		operatorsNumber2 += 5;
		System.out.println(operatorsNumber2 + ": This is your second value entered + 5.");
		if ((operatorsNumber1 >= operatorsNumber2) && (operatorsNumber1 >= 0)) {
			System.out.println(operatorsNumber1 + " and " + operatorsNumber2 + " are equal to each other and " + operatorsNumber1 + " is larger than 1.");
		}
		else {
			System.out.println("Your first value isn't equal to your second number and isn't larger than 0.");
		}
		if ((operatorsNumber1 >= operatorsNumber2) || (operatorsNumber1 >= 0)) {
			System.out.println(operatorsNumber1 + " + " + operatorsNumber2 + " are equal to each other or " + operatorsNumber1 + " is larger than 0.");
		}
		else {
			System.out.println("Your first value isn't equal to your second number or isn't larger than 0.");
		}
		
		
		/*
		 * Looping statements are statements that go through a process multiple times before ending the cycle.
		 * The while loop continues to do certain actions as long as the condition is true.
		 * The do while loop is the same thing as the while loop except it does 1 cycle of actions even if the statement is false before it breaks out of the loop.
		 */
		System.out.println("Enter a number smaller than 5:");
		double whileLoop1 = input.nextDouble();
		while (whileLoop1 < 10) {
			System.out.println(whileLoop1 + " is less than 10");
			++whileLoop1;
		}
		System.out.println("Enter in a number smaller than 10:");
		double doWhileLoop1 = input.nextDouble();
		do {
			++doWhileLoop1;
			System.out.println(doWhileLoop1 + " is your number plus 1 looped.");
		} while (doWhileLoop1 < 8);
		
		
		/*
		 * This is the declaration and instantiation of an array.
		 */
		int[] exArray = { 5 , 10 , 15 };
		
		
		
	}
	

}

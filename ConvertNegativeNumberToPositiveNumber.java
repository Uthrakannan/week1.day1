package week1.day1.assignments;

public class ConvertNegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		/* Problem statement: Convert a negative number to positive number
		---------------------------------------------------------------
		Pseudocode:
		-----------
		1. Initialize an integer with a negative number
		   like, int number = -40;
		2. Check if the number is a negative number 
		   Hint : any number that is lesser than zero is a negative number
		3. If so, convert the number to a positive number

		4. Print as below
		        "The number -40 is converted to 40" ?*/
		
		int number = -40;
		if (number > 0) {
			System.out.println("Give number is Positive"+ Math.abs(number));
		}
		else {
			System.out.println("Give number is Negative"+ Math.abs(number));
		}
	}

		

	}



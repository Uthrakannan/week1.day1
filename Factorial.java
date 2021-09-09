package week1.day1.assignments;

public class Factorial {
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120 */
	public static void main(String[] args) {
		int num = 5;
		int factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial" + factorial);
		}

	}



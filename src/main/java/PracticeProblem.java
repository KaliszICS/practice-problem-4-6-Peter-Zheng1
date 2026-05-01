/**

        * File: Lesson 4.6

        * Author: Peter

        * Date Created: May 1, 2026

        * Date Last Modified: May 1, 2026

        */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int intChecker(){
		Scanner input = new Scanner(System.in);
		
		int valid;
		
		while (true) {
			System.out.print("Input an integer: ");

			if (input.hasNextInt()){
				valid = input.nextInt();

				return valid;
			}
			else {
				System.out.print("Input an integer: ");
				input.nextLine();
			}
		}
	}

	public static double doubleChecker(){
		Scanner input = new Scanner(System.in);

		double valid;

		while (true){
			System.out.print("Input a number: ");

			if (input.hasNextDouble()){
				valid = input.nextDouble();
				return valid;
			}
			else {
				System.out.print("Input a number: ");
				input.nextLine();
			}

		}

	}

	public static boolean booleanChecker(){
		Scanner input = new Scanner(System.in);	

		while (true){
			System.out.print("Input a boolean: ");

			if (input.hasNextBoolean()){
			return input.nextBoolean();

			}
			else {
				System.out.print("Input a boolean: ");
				input.nextLine();
			}
		}
	}



	public static boolean multipleIntChecker(){
		Scanner input = new Scanner(System.in);	

		int count = 0;
		
		while (count < 4){
			System.out.print("Input an integer: ");

			if (input.hasNextInt()){
				input.nextInt();
				count++;
			}
			else {
				input.nextLine();
			}
		}
		return true;
	}

}

/**
 * 
 * @author Arash
 *Write a program that reads in a decimal points grades between 0-100 and 
 *then converts it to the corresponding letter grade based upon the following table:
 *90-100  A
 *80-90   B
 *70-80   C
 *60-70   D
 *0-60    F 
 */

import java.util.*;
public class GradeCalculator 
{

	public static void main(String[] args) 
	{
		// declare variables
		double score;
		char grade;
		
		//input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a score between 0 to 100 to receive the corresponding grade: ");
		score = keyboard.nextDouble();
		
		//check score for double validity (does not test other exceptions)
		while (score < 0 || score > 100)
		{
			System.out.println("The score you entered is incorrect. "
					         + "You entered the score " + score + " Please try again.");
			System.out.print("\nEnter a score between 0 to 100 to receive the corresponding grade: ");
			score = keyboard.nextDouble();
		}
		
		//convert number to letter grade
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';			
		
		//print letter grade		
		System.out.println("Your Final Grade is " + grade);
		
		keyboard.close();
	}

}

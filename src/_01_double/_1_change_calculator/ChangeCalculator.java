package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
			String num1 = JOptionPane.showInputDialog("How many nickels do you have.");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
			int nickels = Integer.parseInt(num1);
		// Ask the user how many dimes they have, and convert their answer
			String num2 = JOptionPane.showInputDialog("How many Dimes?");
			int dimes = Integer.parseInt(num2);
		// Ask the user how many quarters they have, and convert their answer
			String num3 = JOptionPane.showInputDialog("How many Quarters?");
			int quarters = Integer.parseInt(num3);
		// Calculate how much money the user has.  Hint: Use a double variable 
			double dim, nick, answer;
				dim = dimes;
				nick = nickels;
				answer = dim + nick;
				JOptionPane.showMessageDialog(null, answer);

				
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}


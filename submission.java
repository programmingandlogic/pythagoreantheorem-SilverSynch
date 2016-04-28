/*
 * File: Pythagoras.java
 * --------------------
 * This program is a stub for the Quadratic problem, which finds the
 * roots of the quadratic equation.
 */

import acm.program.*;

public class Pythagoras extends ConsoleProgram
{

	public void run()
	{
		
		while (true)
		{
			
			// We ask for our numbers.
			println("Pythagorean theorum");
			int a = readInt("a: ");
			int b = readInt("b: ");
			
			// Simple calculation.
			if (a != 0 && b != 0)
			{
				double c = Math.sqrt((a * a) + (b * b));
				println("c: " + c);
			}
			
			// Entering zeros will throw an error before starting again.
			else
			{
				println("Input a valid number.");
			}
			
		}
		
	}

}

package com.javaConditionStatements;

public class Example4
{

	public static void main(String[] args) 
	{
      /**
       *  Write a java program to verify the given number is positive or negative,
       *  if positive then verify again the number is an even or odd.
       *  
       *  Note : use nested if - else statement
       */
		int number =99 ; 
	if (number>0)// positive or negative
	{
		System.out.println("The number is positive");
		
		if (number%2 == 0)
		{
         System.out.println("The number is an even");
         }
		else
		{
			System.out.println("The number is an odd");
		}
	}
	else
	{
		System.out.println("The number is Negative");
	}

	}
}

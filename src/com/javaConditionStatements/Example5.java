package com.javaConditionStatements;

public class Example5 
{

	public static void main(String[] args) 
	{
     /**
      * Write a java program to provide a grade system to the student,
      * based on the mark scored out off 100 by student. Use else-if ladder statement
      * 
      *  Note : 100-75  - Distinction
      *         74-60   - First class
      *         59-50   - Second class
      *         49-41   - Third class
      *         40      - Pass
      *         below 40- Fail
      */
		 int marks = 52;
		 
		 if (marks <= 100 && marks >= 75)
		 {
			 System.out.println("Distinction");
		 }
		 else if(marks <= 74 && marks >= 60)
		 {
			 System.out.println("First Class");
	     }
		 else if(marks <= 59 && marks >= 50)
		 {
			 System.out.println("Second Class");
		 }
		 else if (marks <= 49 && marks >= 41)
		 {
			System.out.println("Third Class"); 
		 }
		 else if (marks == 40)
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
	}

}

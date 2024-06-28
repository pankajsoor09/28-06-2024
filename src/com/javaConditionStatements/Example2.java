package com.javaConditionStatements;

public class Example2
{

	public static void main(String[] args) 
	{
       int studentAge = 10;
       
       boolean condition = (studentAge >= 18);
       
       System.out.println(condition);
       
       if (condition)
       {
    	  System.out.println("The person is major");
    	  
       }
       else
       {
    	   System.out.println("The person is minor");
       }
	}

}

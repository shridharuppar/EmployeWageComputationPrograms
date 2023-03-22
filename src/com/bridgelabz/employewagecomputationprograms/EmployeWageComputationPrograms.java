package com.bridgelabz.employewagecomputationprograms;

public class EmployeWageComputationPrograms 
      {
     public static void main(String[] args) 
     {
	
	
    	 int IS_FULL_TIME = 1;
    	    double empCheck = Math.floor(Math.random() *10) % 2;

    	    /* Here we use Math.random() to generate random nos between o & 1.
    	     * We use Math.floor() method to get decimal values only in integer number.
    	     */

    	    if (empCheck == IS_FULL_TIME) 
    	    {
    	        System.out.println("Employee is Present");
    	    } 
    	    else 
    	    {
    	        System.out.println("Employee is Absent");
    	    }
    	}
}

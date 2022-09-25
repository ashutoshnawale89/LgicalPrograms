package com.logicalprogram;

import java.util.Scanner;

public class GeorgianYearFormula {
	
	public static void main(String[] args) 
	{
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
	    int equation1=(year-(14-month))/12;
	    int equation2=(equation1+equation1)/(4-equation1)/(100+equation1)/400;
	    int equation3=(month+12)*((14-month)/12)-2;
	    int equation4=((day+equation2+(31*equation3))/12);
	    
	    System.out.println(equation4);
	}
}

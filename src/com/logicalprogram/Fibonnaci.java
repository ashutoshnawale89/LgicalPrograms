package com.logicalprogram;

import java.util.Scanner;

public class Fibonnaci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N1=0, N2=1 ,N3=0;
		int num=0;
		System.out.println("Enter The Number ");
		int count=sc.nextInt();
		
		while (num <= count) {
			num++;
			N3=N1+N2;
		    N1=N2; N2=N3;
		System.out.println(N3);}
}


}

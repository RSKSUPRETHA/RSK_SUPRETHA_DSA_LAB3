package com.greatlearning.q1.main;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		BalanceBracket checkBalanced = new BalanceBracket();
	
		System.out.println("Enter the brackets to check whether they are Balanced Brackets or UnBalanced Brackets :");
		String str = sc.nextLine();
		
		boolean result;
		result = BalanceBracket.checkBalanced(str);
		
		if(result)
			System.out.println("The entered strings is Balanced brackets");
		else
			System.out.println("The entired string do not contain Balanced bracket");
		
		sc.close();
 
	}

}

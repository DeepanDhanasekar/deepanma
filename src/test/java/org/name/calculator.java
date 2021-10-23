package org.name;

import java.util.Scanner;

public class calculator { 
	Scanner scanner=new Scanner(System.in);
	public int add() {
		System.out.println("Enter the value1:");
		int a=scanner.nextInt();
		System.out.println("Entet the value2:");
		int b=scanner.nextInt();
		int c=a+b;
		System.out.println(c);
		return 0;
		
	}public int sub() {
		System.out.println("Enter the value1:");
		int a=scanner.nextInt();
		System.out.println("Entet the value2:");
		int b=scanner.nextInt();
		int c=a-b;
		System.out.println(c);
		return 0;
		
	}public int multi() {
		System.out.println("Enter the value1:");
		int a=scanner.nextInt();
		System.out.println("Entet the value2:");
		int b=scanner.nextInt();
		int c=a*b;
		System.out.println(c);
		return 0;
		
	}public int divi() {
		System.out.println("Enter the value1:");
		int a=scanner.nextInt();
		System.out.println("Entet the value2:");
		int b=scanner.nextInt();
		int c=a/b;
		System.out.println(c);
		return 0;
		
	}

}

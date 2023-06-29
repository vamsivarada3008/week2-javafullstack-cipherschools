package week2;

import java.util.Scanner;

//Exception Handling in Java

public class Lecture13 {
	int n1,n2,result;
	Scanner sc=new Scanner(System.in);
	void calculate() {
		try {
		System.out.println("Enter First Number:");
		sc.nextInt();
		System.out.println("Enter Second Number:");
		sc.nextInt();
		result=n1/n2;
		}
		catch(Exception e) {
			System.out.println("An Error Occured");
		}
		System.out.println("The Division is :"+result);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lecture13 obj=new Lecture13();
		obj.calculate();

	}

}

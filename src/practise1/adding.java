package practise1;

import java.util.Scanner;

public class adding {

	public static void main(String[] args) {
		
		int num1 = 5 , num2 = 15 , sum;
		sum = num1 + num2 ;
		
		System.out.println("sum of these numbers:"+sum);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Fir0st Number: ");
		num1=sc.nextInt();
		System.out.println("Enter First Number: ");
		num2=sc.nextInt();
		sc.close();
		sum = num1 + num2 ;
		System.out.println("Sum of these numbers: "+sum);
		

	}

}

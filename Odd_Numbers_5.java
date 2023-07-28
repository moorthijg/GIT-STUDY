package Interview_Questions;

import java.util.Scanner;

public class Odd_Numbers_5 {

	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a%2!=0) {
			System.out.println("It's a odd number");
		}
		else {
			System.out.println("It's a even number");
		}
	}
}
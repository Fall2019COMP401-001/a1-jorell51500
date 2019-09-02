package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		
		int customerNumber = scan.nextInt();
//		int[] itemsBought = new int[customerNumber];
		int itemsBought;
		String[] firstName = new String[customerNumber];
		String[] lastName = new String[customerNumber];
		
		
		for (int i=0; i<customerNumber; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			itemsBought = scan.nextInt();
			double totalPrice = 0;
			for (int j=0; j<itemsBought; j++) {
				int num = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				totalPrice += num * price;
			}
			System.out.println(firstName[i].charAt(0) + ". " + lastName[i] + ": " + String.format("%.2f", (totalPrice)));
		}
		
		//String[] totalCustomers = new String[customerNumber];		
		
	}	
}

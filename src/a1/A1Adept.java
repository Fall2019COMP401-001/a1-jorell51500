package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItems = scan.nextInt();
		String[] itemName = new String[storeItems];
		double[] itemPrice = new double[storeItems];
		int itemsBought;
		//int[] itemQuantity = new int[itemsBought];
		//String[] itemName2 = new String[itemsBought];
		
		
		
		for (int i=0; i<storeItems; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		
		int customerNumber = scan.nextInt();
		String[] firstName = new String[customerNumber];
		String[] lastName = new String[customerNumber];
		double[] totalPrice = new double[customerNumber];
		for (int j=0; j<customerNumber; j++) {
			firstName[j] = scan.next();
			lastName[j] = scan.next();
			itemsBought = scan.nextInt();
			for (int k=0; k<itemsBought; k++) {
				//itemQuantity[k] = scan.nextInt();
				//itemName2[k] = scan.next();
				totalPrice[j] += scan.nextInt() * getPrice(scan.next(), itemName, itemPrice);
				
			}
		}
		
		int biggest = findLargestValue(totalPrice);
		int smallest = findSmallestValue(totalPrice);
		double avg = average(totalPrice);
		
		/*System.out.println(totalPrice[0]);
		System.out.println(totalPrice[1]);
		System.out.println(totalPrice[2]);
		System.out.println(firstName[1]);
		*/
		System.out.println("Biggest: " + firstName[biggest] + " " + lastName[biggest] + "(" + String.format("%.2f", totalPrice[biggest]) + ")" );
		System.out.println("Smallest: " + firstName[smallest] + " " + lastName[smallest] + "(" + String.format("%.2f", totalPrice[smallest]) + ")" );
		System.out.println("Average: " + String.format("%.2f", avg));
	}
		
		
	public static double findLargestValue(double[] vals) {
		int startMax = 0;
		for (int i=0; i<vals.length;i++) {
			if (vals[i] > startMax) {
				startMax = i;
			}
		}
		return startMax;
	}
	
	public static double findSmallestValue(double[] vals) {
		int startMin = 0;
		for (int i=0; i<vals.length;i++) {
			if(vals[i] < vals[vals.length-1]) {
				startMin = i ;
			}
			
		}
		return startMin;
	}
	
	public static double average(double[] vals) {
		double avg = 0;
		for (int i=0; i<vals.length;i++) {
			avg += vals[i];
		}
		return avg / vals.length;
	}

	public static double getPrice(String vals, String[] itemName, double[] num) {
		double finalPrice = 0;
		for (int i=0; i<itemName.length; i++) {
			if (itemName[i].equals(vals)) {
				finalPrice += num[i];
			}
		}
		return finalPrice;
	}
}

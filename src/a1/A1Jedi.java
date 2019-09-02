package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int storeItems = scan.nextInt();
		String[] itemName = new String[storeItems];
		double[] itemPrice = new double[storeItems];
		int itemsBought;
		
		for (int i=0; i<storeItems; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		
		int customerNumber = scan.nextInt();
		String[] firstName = new String[customerNumber];
		String[] lastName = new String[customerNumber];
		int[] totalItem = new int[storeItems];
		int[] calculateItem = new int [storeItems];
		
		
		
		for (int j=0; j<customerNumber; j++) {
			firstName[j] = scan.next();
			lastName[j] = scan.next();
			itemsBought = scan.nextInt();
			int[] totalitemsBought =new int[itemsBought];
			for (int k=0; k<itemsBought; k++) {
				int itemNumber = scan.nextInt();
				String itemValue = scan.next();
				for (int l=0; l<storeItems;k++) {
					totalItem[l] = numberItemBought(itemNumber, itemValue, itemName);
				}
			}
		}
		
			
			for(int i=0; i<storeItems; i++) {
				if (totalItem[i] == 0) {
					System.out.println("No customers bought " + itemName[i]);
				} else {
					System.out.println(totalItem[i] + "customers bought" +  itemName[i]);
				}
				
			}
		}
			
		
		/*public static double getPrice(String vals, String[] itemName, double[] num) {
			double finalPrice = 0;
			for (int i=0; i<itemName.length; i++) {
				if (itemName[i].equals(vals)) {
					finalPrice += num[i];
				}
			}
			return finalPrice;
	}
	*/
		
		public static int numberItemBought (int num, String val, String[] itemName) {
			int curNum = 0;
			for(int i=0; i<itemName.length;i++) {
				if(itemName[i].equals(val)) {
					curNum += 1 * num;
				}
			}
			return curNum;
		}
		
	}



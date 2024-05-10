package Cafe_Bill;

import java.util.Scanner;


class Menuitem {
	String name;
	double price;
	Menuitem ( String name,double price) {
		this.name=name;
		this.price=price;
	}
}
public class CafeBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menuitem [] menu= { 
				new Menuitem( "tea",10),
				new Menuitem( "samosa",15),
				new Menuitem("pestry",60),
				new Menuitem(" cake",250),
				new Menuitem( " burger",80) };
				// prompt user for order
		Scanner scanner=new Scanner (System.in);
		System.out.println(" enter the no of item");
		int numberofitems=scanner.nextInt();
		scanner.nextLine();
				//order processing
		for ( int i=0;i<numberofitems;i++) {
			System.out.println((i+1)+"name");
			String itemname=scanner.nextLine();
			Menuitem item=null;
			for ( Menuitem menuitem : menu) { 
				if (menuitem.name.equalsIgnoreCase(itemname) ) {
					item=menuitem;
					break;
				}
			}
			if (item == null) {
                System.out.println("Invalid item name. Please try again.");
                i--; // Re-prompt for the same item
                continue;
            }
			
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            double allbill = item.price * quantity;
        }

        // Apply discount if applicable
        double discountthreshold = 50.0;
        double discountrate = 0.1;
        if (allbill> discountthreshold) {
            double discountAmount = allbill * discountrate;
            allbill -= discountAmount;
            System.out.println(" 10% discount!");
        }
		 System.out.println( "Receipt");
		/*  Discount discount = new Discount();
	        double allbill = 75.0;
	        allbill = discount.applyDiscount(allbill);
	        System.out.println("Final bill amount: " + allbill);
*/
        // Display receipt
       // System.out.println( "Receipt");
        for (int i = 0; i < numberofitems; i++) {
        //    System.out.println( menu[i].name, quantity,menu[i].price *quantity);
         
        }
       
        // Close scanner
        scanner.close();
    }
};

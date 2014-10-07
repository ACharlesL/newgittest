/**
 * Exercise 6
 * @author 
 *
 */

public class sales {

	
	public int numberOfItems;
	public int totalSales;
	public double totalDiscount;
	public int costPerItem;
	public int bulkQuantity;
	public double bulkDiscountPercentage;
	
	
	
	public  void registerSale(int numberSold){
		if (numberSold >= bulkQuantity){
	//		apply discount to totalSales 
			
		int toatalSales	=(costPerItem/bulkDiscountPercentage) ;
		}
	}
	public void displaySales(){
		System.out.println("number of item sold = "+ numberOfItems);
		System.out.println("Total sales = "+ totalSales);
		System.out.println("Total discount = "+ totalDiscount);
	}
		
}

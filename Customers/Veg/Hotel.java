package Customers.Veg;

import Vendors.Veg.VegetableVendor; 
public class Hotel extends VegetableCustomer {

  	VegetableVendor vegetableVendor;
  	double totalCost;

	public Hotel(VegetableVendor vegetableVendor) {
    	this.vegetableVendor = vegetableVendor;
    	totalCost = 0;
 	}

  	public final void purchase(String vegetableName) {
    	boolean available ;
    	available = vegetableVendor.inquiryVegetable( vegetableName);
    	if(available) {
      		double cost = vegetableVendor.getCostOfSpecificVegetable();
      		double discount = vegetableVendor.discountToSpecificCustomer(this);
      		if(discount > 0) {
        		totalCost += cost - discount;
        		vegetableVendor.sellSpecificVegetable(); 
    		}
      		else {
       			System.out.println("Didnt Get Any Discount");
      		}
    	}
    	else {
        	System.out.println("Didnt Get " + vegetableName);
    	}
  	} 


  	public int quantity() {
    System.out.println("in quantity of Hotel");
    return 5;
  	}

  	public double getTotalCost() {
  		return totalCost;
  	}

}
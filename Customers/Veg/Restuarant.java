package Customers.Veg;

import Vendors.Veg.VegetableVendor; 
public class Restuarant extends VegetableCustomer {

  	VegetableVendor vegetableVendor;
  	double totalCost;

	public Restuarant(VegetableVendor vegetableVendor) {
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
       			System.out.println("Didnt Got Any Discount");
      		}
    	}
    	else {
        	System.out.println("Didnt Got " + vegetableName);
    	}
  	} 


  	public int quantity() {
    System.out.println("in quantity of Restuarant");
    return 2;
  	}

  	public double getTotalCost() {
  		return totalCost;
  	}

}
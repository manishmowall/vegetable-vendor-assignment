

import Vendors.Veg.*;
import Customers.Veg.*;

public class ApplicationOfVegetableBuyingFromVendor {
	
 	public static void main(String args[]) {
  		double totalCost;
  		VegetableVendorImplementation vv = new VegetableVendorImplementation();
  		Hotel h = new Hotel(vv);
  		h.purchase("potato");
  		h.purchase("onion");
  		h.purchase("tomato");	

  		totalCost = h.getTotalCost();
  		System.out.println(totalCost);

  		Restuarant r = new Restuarant(vv);
  		r.purchase("brinjal");
  		r.purchase("onion");
  		r.purchase("tomato");	

  		totalCost = r.getTotalCost();
  		System.out.println(totalCost);
 	}
}
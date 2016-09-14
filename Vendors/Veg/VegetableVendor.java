package Vendors.Veg;

import Customers.Veg.VegetableCustomer;

public interface VegetableVendor {
	boolean inquiryVegetable(String name);
	double discountToSpecificCustomer(VegetableCustomer customer);
	double getCostOfSpecificVegetable();
	void sellSpecificVegetable();
}


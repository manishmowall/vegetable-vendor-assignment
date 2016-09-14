package Vendors.Veg;

import Customers.Veg.VegetableCustomer;

public class VegetableVendorImplementation implements VegetableVendor {
	Vegetable[] vegetables;
	int current; //state managment

  

	public VegetableVendorImplementation() {
		vegetables = new Vegetable[4];
		vegetables[0] = new VegetableImplementation("tomato", 30.0);
    	vegetables[1] = new VegetableImplementation("potato", 25.0);
    	vegetables[2] = new VegetableImplementation("brinjal", 60.0);
    	vegetables[3] = new VegetableImplementation("onion", 30.0);
    	current = -1;
	}

	public boolean inquiryVegetable(String name) {
		 int i;
    	String temp;
    	boolean flag;

    	flag = false;
    	current = -1;

    	//sequential search
    	for(i =0 ; i < vegetables.length; i++)
    	{
      		temp = vegetables[i].getName();
      		if(temp.equalsIgnoreCase(name)) 
      		{
        		flag = true; 
        		current = i;
        		break;
      		}
    	}//for
 
    	return flag;
	}

	public double discountToSpecificCustomer(VegetableCustomer customer) {
		int c = (int) getCostOfSpecificVegetable();
    	int q = customer.quantity();//run time binding
    	if(q < 2)
     		return 0;
    	else if(q >=2 && q <= 5) 
     		return c * 0.1;
    	else if(q > 5) 
     		return c * 0.2;
    	else
     		return 0;
	}

	public double getCostOfSpecificVegetable() {
		return vegetables[current].getPrice(); 
	}

	public void sellSpecificVegetable() {
		System.out.println("Selling Vegetable " + vegetables[current].getName());

	}


}


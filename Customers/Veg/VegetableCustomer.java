package Customers.Veg;


public abstract class VegetableCustomer {
	
    public abstract void purchase(String vegetableName); 
    public abstract int quantity();
    public abstract double getTotalCost();
}
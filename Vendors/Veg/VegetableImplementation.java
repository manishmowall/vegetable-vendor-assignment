package Vendors.Veg;

class VegetableImplementation implements Vegetable {
	private String name;
	private double price;

	public VegetableImplementation(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
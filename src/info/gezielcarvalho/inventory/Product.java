package info.gezielcarvalho.inventory;
//Project 5

public class Product {
	//Instance field declarations
	private long itemNumber;
	private String productName;
	private int unitsInStock;
	private double unitPrice;
	private boolean active;
	
	

	//Constructor that allows the compiler to initialize the fields to their default values
	public Product() {
		this.itemNumber = Math.round(Math.random()*1000)+5; //Create a random item number greater than 4
		this.productName = "Produto_"+Long.toString(this.itemNumber);//create a fake name, based on the itemNumber
		this.unitsInStock = 0;
		this.unitPrice = 1;
		this.active = true;
	}

	//Constructor with parameters for  all four of the class’ instance fields so that they can be initialized with  values from the driver class
	public Product(long itemNumber, String productName, int unitsInStock, double unitPrice, boolean isActive) {
		super();
		this.itemNumber = itemNumber;
		this.productName = productName;
		this.unitsInStock = unitsInStock;
		this.unitPrice = unitPrice;
		this.active = isActive;
	}

	// Gets itemNumber value
	public long getItemNumber() {
		return itemNumber;
	}

	// Sets itemNumber value
	public void setItemNumber(long itemNumber) {
		this.itemNumber = itemNumber;
	}

	// Gets active status
	public boolean isActive() {
		return active;
	}

	// Sets active status
	public void setActive(boolean active) {
		this.active = active;
	}

	// Gets productName value
	public String getProductName() {
		return productName;
	}

	// Sets productName value
	public void setProductName(String productName) {
		this.productName = productName;
	}

	// Gets unitsInStock value
	public int getUnitsInStock() {
		return unitsInStock;
	}

	// Sets unitsInStock value
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	// Gets unitPrice value
	public double getUnitPrice() {
		return unitPrice;
	}

	// Sets setUnitPrice value
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getInventoryValue() {
		return this.unitPrice * this.unitsInStock;
	}	

	@Override
	public String toString() {
		return    "\nItem Number      : " + itemNumber + "\n"
				+ "Name             : " + productName + "\n"
				+ "Quantity in stock: " + unitsInStock  + "\n"
				+ "Price            : " + unitPrice + "\n" 
				+ "Stock value      : " + this.getInventoryValue() + "\n" 
				+ "Product status   : " + (active?"Active":"Discontinued") + "\n\n";
	}
	
}

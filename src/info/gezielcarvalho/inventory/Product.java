package info.gezielcarvalho.inventory;
//Projeto 4

public class Product {
	//Instance field declarations
	private long itemNumber;
	private String productName;
	private int unitsInStock;
	private double unitPrice;

	//Constructor that allows the compiler to initialize the fields to their default values
	public Product() {
		this.itemNumber = Math.round(Math.random()*1000)+5; //Create a random item number greater than 4
		this.productName = "Produto_"+Long.toString(this.itemNumber);//create a fake name, based on the itemNumber
		this.unitsInStock = 0;
		this.unitPrice = 1;
	}

	//Constructor with parameters for  all four of the class’ instance fields so that they can be initialized with  values from the driver class
	public Product(long itemNumber, String productName, int unitsInStock, double unitPrice) {
		super();
		this.itemNumber = itemNumber;
		this.productName = productName;
		this.unitsInStock = unitsInStock;
		this.unitPrice = unitPrice;
	}

	// Gets itemNumber value
	public long getItemNumber() {
		return itemNumber;
	}

	// Sets itemNumber value
	public void setItemNumber(long itemNumber) {
		this.itemNumber = itemNumber;
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

	@Override
	public String toString() {
		return    "Item Number      : " + itemNumber + "\n"
				+ "Name             : " + productName + "\n"
				+ "Quantity in stock: " + unitsInStock  + "\n"
				+ "Price            : " + unitPrice + "\n\n";
	}
	
}

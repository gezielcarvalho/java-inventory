package info.gezielcarvalho.inventory;

import java.util.Scanner;

/*
 * Modify the ProductTester class
 * 
 * a) Add a Scanner called in to the beginning of your main method.
 * 
 * b) Create local variables that will store values for the for each of the attributes of the 
 * Product class.  Name the variables tempNumber, tempName, tempQty and tempPrice.
 * 
 * c) Ask the user to input values for the for each of the attributes of the Product class.  
 * Ask for the name, quantity, price and item number, store the values in temporary local 
 * variables that you have just created.
 * 
 * d) Use the values that were entered by the user to create the p1 object.  This means that 
 * you will be using the constructor that takes 4 parameters instead of the default constructor.
 * */

public class ProductTester {

	public ProductTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// a) Add a Scanner called in to the beginning of your main method.

		Scanner leitor = new Scanner(System.in);
		
		// b) Create local variables that will store values for the for each of the attributes of the 
		// Product class.  Name the variables tempNumber, tempName, tempQty and tempPrice.
		long tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		boolean tempActive;
		
		// c) Ask the user to input values for the for each of the attributes of the Product class.
		
		System.out.println("Informe o número do item: ");
		tempNumber = leitor.nextLong();
		System.out.println("Informe o nome do item: ");
		tempName = leitor.next();
		System.out.println("Informe a quantidade do item: ");
		tempQty = leitor.nextInt();
		System.out.println("Informe o número do item: ");
		tempPrice = leitor.nextDouble();
		System.out.println("Informe se o item está ativo: ");
		tempActive = leitor.nextBoolean();
		
		
		// Products created by providing values for the arguments
		Product produtoUm = new Product(tempNumber,tempName,tempQty,tempPrice,tempActive);		
		
		System.out.println("Informe o número do item: ");
		tempNumber = leitor.nextLong();
		System.out.println("Informe o nome do item: ");
		tempName = leitor.next();
		System.out.println("Informe a quantidade do item: ");
		tempQty = leitor.nextInt();
		System.out.println("Informe o número do item: ");
		tempPrice = leitor.nextDouble();
		System.out.println("Informe se o item está ativo: ");
		tempActive = leitor.nextBoolean();
		
		// Products created by providing values for the arguments
		Product produtoDois = new Product(tempNumber,tempName,tempQty,tempPrice,tempActive);		
	
		leitor.close();	
		
		// Products created by providing values for the arguments
		Product produtoTres = new Product(1L,"Mouse",10,1.2,true);
		Product produtoQuatro = new Product(2L,"Teclado",11,1.3,true);
		Product produtoCinco = new Product(3L,"Monitor",12,1.4,true);
		Product produtoSeis = new Product(4L,"Gabinete",13,1.5,true);
		
		produtoSeis.setActive(false);
		
		System.out.print(produtoUm);
		System.out.print(produtoDois);
		System.out.print(produtoTres);
		System.out.print(produtoQuatro);
		System.out.print(produtoCinco);
		System.out.print(produtoSeis);		
	}

}

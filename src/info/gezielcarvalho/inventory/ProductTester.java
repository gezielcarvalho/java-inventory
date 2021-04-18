package info.gezielcarvalho.inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Modify the ProductTester class
 * 
 * a) Add a Scanner called in to the beginning of your main method.
 * 
 * b) Create local variables that will store values for the for each of the 
 * attributes of the Product class.  Name the variables tempNumber, tempName, 
 * tempQty and tempPrice.
 * 
 * c) Ask the user to input values for the for each of the attributes of the 
 * Product class. Ask for the name, quantity, price and item number, store the
 * values in temporary local variables that you have just created.
 * 
 * d) Use the values that were entered by the user to create the p1 object.  
 * This means that you will be using the constructor that takes 4 parameters 
 * instead of the default constructor.
 * */

public class ProductTester {

	public static void main(String[] args) {
		
		// a) Add a Scanner called in to the beginning of your main method.
		Scanner leitor = new Scanner(System.in);

		//Project 6 2.a) Create a variable named maxSize that can store integers.
		int maxSize = 0;

		//Project 6 2.b) Create a prompt at the beginning of your main method that will instruct the user to enter the required value for the number of products they wish to store:
		
		//Project 6 2.c) c) Use a do while loop so that the program will not continue until a valid positive value is entered. If a value less than zero is entered an error message stating “Incorrect Value entered” should be displayed before the user is re-prompted to enter a new value. You should not leave the loop until a value of zero or greater is entered
		
		do {
			
			if (maxSize != 0) {
				
				System.out.println("Incorrect value entered");
				
			}
			
			System.out.println("Enter the number of products you would like to add: ");
			System.out.println("Enter 0 (zero) if you do not wish to add products: ");
			
			/*
			Project 6 3.a) Add a try block that surrounds all of the code 
			inside the do while loop.
			 */
			
			try {
				
				maxSize = leitor.nextInt();	
				
			}
			catch(InputMismatchException e) {

				/* 
				Project 6 3.f)Take a note of the specific type of Exception 
				produced when you enter a character and create a catch 
				statement just for that exception. This error should display an
				Incorrect data type entered! message to the console and should 
				also clear the input buffer.
				*/ 
				 
				System.out.println("Incorrect data type entered");	
				maxSize = -1;
				
				/*
				Project 6 3.b) Add a catch statement above the while that will 
				take an Exception e parameter. The program should use a console
				output statement to display the value of e to screen.	
				*/			

				System.out.println(e);	
				
				/*
				Project 6 3.e) Add a line of code in your catch statement that 
				will clear out the input buffer so that the prompt will be 
				displayed, and the system will wait for user input.
				 */
				
				leitor.next();
				
			}
			
		} while(maxSize<0);
			
		/*
		Create an if statement that will display the message “No products 
		required!” to the console if the value of maxSize is zero.
		 */
		
		if (maxSize==0) {
			
			System.out.println("No products required!");
			
		} else {
			
			// b) Create local variables that will store values for the for each of the attributes of the 
			// Product class.  Name the variables tempNumber, tempName, tempQty and tempPrice.
			
			long tempNumber;
			String tempName;
			int tempQty;
			double tempPrice;
			boolean tempActive;			
			
			/*
			4. Modify the ProductTester class to handle multiple products using a 
			single dimensional array if a value greater than zero is entered.
			*/
			
			Product produto[] = new Product[maxSize];
			
			for(int contador=0;contador<maxSize;contador++) {
				
				/*
				c) Ask the user to input values for the for each of the attributes 
				of the Product class. 
				*/

				System.out.println("Informe o número do item #"+(contador+1)+": ");
				tempNumber = leitor.nextLong();
				
				leitor.nextLine(); //esvaziar buffer antes de pegar strings
				
				System.out.println("Informe o nome do item #"+(contador+1)+": ");
				tempName = leitor.nextLine();
				
				System.out.println("Informe a quantidade do item #"+(contador+1)+": ");
				tempQty = leitor.nextInt();
				
				System.out.println("Informe o preço do item #"+(contador+1)+": ");
				tempPrice = leitor.nextDouble();
				
				System.out.println("Informe se o item #"+(contador+1)+" está ativo: ");
				tempActive = leitor.nextBoolean();
				
				produto[contador] = new Product(
						tempNumber,
						tempName,
						tempQty,
						tempPrice,
						tempActive
						);
				
			}
			
			// Products created by providing values for the arguments
			Product produtoTres = new Product(1L,"Mouse",10,1.2,true);
			Product produtoQuatro = new Product(2L,"Teclado",11,1.3,true);
			Product produtoCinco = new Product(3L,"Monitor",12,1.4,true);
			Product produtoSeis = new Product(4L,"Gabinete",13,1.5,true);
			
			produtoSeis.setActive(false);
			
			System.out.print(produtoTres);
			System.out.print(produtoQuatro);
			System.out.print(produtoCinco);
			System.out.print(produtoSeis);	
			
			for(int contador=0;contador<maxSize;contador++) {
				System.out.print(produto[contador]);
			}		
			
		}
		
		leitor.close();	
		
	}

}

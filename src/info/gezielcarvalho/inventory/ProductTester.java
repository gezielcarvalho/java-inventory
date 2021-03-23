package info.gezielcarvalho.inventory;

public class ProductTester {

	public ProductTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create and initialize six Product objects
		
		// Products created using the default constructor
		Product produtoUm = new Product();
		Product produtoDois = new Product();
		
		// Products created by providing values for the arguments
		Product produtoTres = new Product(1L,"Mouse",10,1.2);
		Product produtoQuatro = new Product(2L,"Teclado",11,1.3);
		Product produtoCinco = new Product(3L,"Monitor",12,1.4);
		Product produtoSeis = new Product(4L,"Gabinete",13,1.5);
		
		System.out.print(produtoUm);
		System.out.print(produtoDois);
		System.out.print(produtoTres);
		System.out.print(produtoQuatro);
		System.out.print(produtoCinco);
		System.out.print(produtoSeis);
	}

}

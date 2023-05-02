package pizza;

import java.util.Scanner;
 public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        PizzaOrder order = new PizzaOrder();
	       
	        System.out.println("\t\t\t===============================================\n"
	        		+ "					[  PRICES  ]\n"
	        		+ "				Pizzas: Small = 150\n"
	        		+ "					Medium = 250\n"
	        		+ "					Large = 350\n"
	        		+ ""
	        		+ "				Addon Toppings: +5\n"
	        		+ "\t\t\t===============================================\n");
	        
	        while (true) {
	            System.out.println("Enter pizza number # (type '6' to finish order):\n"
	            		+ "1. The Cheesy Joke\n"
	            		+ "2. The Veggie Tales\n"
	            		+ "3. The Meat Lover's Nightmare\n"
	            		+ "4. The Hawaiian Punch\n"
	            		+ "5. The Pepperoni Party\n");
	            		
	            
	            System.out.print("Choice: ");
	            int name = scanner.nextInt();
	            
	            System.out.println("Enter Size\n"
	            		+ "1. Small\n"
	            		+ "2. Medium\n"
	            		+ "3. Large"
	            		);
	            System.out.print("Choose: ");
	            int size = scanner.nextInt();
	            
	            	

	            System.out.print("Enter number of cheese toppings:");
	            int cheeseToppings = scanner.nextInt();
	            
	            

	            System.out.print("Enter number of pepperoni toppings:");
	            int pepperoniToppings = scanner.nextInt();

	            System.out.print("Enter number of ham toppings:");
	            int hamToppings = scanner.nextInt();

	            System.out.print("Enter quantity:");
	            int quantity = scanner.nextInt();
	            

	            Pizza pizza = new Pizza(cheeseToppings, pepperoniToppings, hamToppings, quantity);
	            order.addPizza(pizza);
	            pizza.setChoice(name);
	            pizza.setSize(size);
	            System.out.println("Do you want to Order more? (1: YES || 2. NO)");
	            int cont = scanner.nextInt();
	            
	            if (cont >= 2) {
	            	break;
	            	
	            }
	            
	        }
	        System.out.println("\n\n======[ Reciept ]======\n");
	        order.displayOrder();
	        System.out.println("===================");
;	    }
}
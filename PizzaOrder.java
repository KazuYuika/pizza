package pizza;

public class PizzaOrder {
	private Pizza[] pizzas;
    private int totalPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[3];
        totalPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (totalPizzas < 3) {
            pizzas[totalPizzas] = pizza;
            totalPizzas++;
        } else {
            System.out.println("Maximum order limit reached.");
        }
    }

    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < totalPizzas; i++) {
            total += pizzas[i].calcCost();
        }
        return total;
    }

    public void displayOrder() {
        for (int i = 0; i < totalPizzas; i++) {
            System.out.println(pizzas[i].getDescription() + " Cost: " + pizzas[i].calcCost());
        }
        System.out.println("===========================");
        System.out.println("Total cost: " + calcTotal());
    }
}
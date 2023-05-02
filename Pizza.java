package pizza;

public class Pizza {
	private String name;
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    private int quantity;

    public Pizza( int cheeseToppings, int pepperoniToppings, int hamToppings, int quantity) {
        
        
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
        this.quantity = quantity;
        
        System.out.println("\n===========================================\n"
        		+ "	Pizza Successfully Ordered\n"
        		+ "===========================================\n\n");
    }

    
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calcCost() {
        double cost = 0;
        switch (size) {
            case "Small":
                int sm = 150;
                cost += sm;
                break;
            case "Medium":
                int md = 250;
                cost += md;
                break;
            case "Large":
                int lg = 350;
                cost += lg;
                break;
        }
        cost += cheeseToppings * 5;
        cost += pepperoniToppings * 5;
        cost += hamToppings * 5;
        
        return cost * quantity;
    }
    public void setChoice(int choice) {
    	
        if (choice == 1) {
        	name = "The Cheesy Joke";
        }
        else if (choice == 2) {
        	name = "The Veggie Tales";
        }
        else if (choice == 3) {
        	name = "The Meat Lover's Nightmare";
        }
        else if (choice == 4) {
        	name = "The Hawaiian Punch";
        }
        else if (choice == 5) {
        	name = "The Pepperoni Party";
        }
    	
    }
    public void setSize(int size1) {
    	if (size1 == 1) {
    		size = "Small";
    	}
    	else if(size1 == 2) {
    		size = "Medium";
    		
    	}
    	else if(size1 == 3) {
    		size = "Large";
    	}
    	
    }

    public String getDescription() {
        return "\n[ " + quantity + " x ] " + size + " " + name + " pizza \n"
        		+ "Toppings: " + cheeseToppings + " cheese toppings, \n" + " 	  " + pepperoniToppings + " pepperoni toppings, \n" + " 	  " + hamToppings + " ham toppings.";
    }
}
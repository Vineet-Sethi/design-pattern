/* 
public abstract class Pizza{

	public abstract void setDescription(String newDescription);
	public abstract String getDescription();
	
	public abstract void setCost(double newCost);
	public abstract double getCost();
	
	// I could use getter and setter methods for every 
	// potential Pizza topping
}
*/

// By going this route I'll have to create a new subclass
//for an infinite number of pizza.
//I'd also have to change prices in many classes 
//when just 1 Pizza topping cost changes

//Inheritance is static while composition is dynamic
//Through composition I'll be able to add new functionality
//by writing new code rather than by changing current code

/*public class ThreeCheesePizza extends Pizza{   //EXTENDS THE ABSTRACT CLASS IN Pizza.java

	private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
	private double cost = 10.50;
	
	public void setDescription(String newDescription) {
		
		description = newDescription;
		
	}

	public String getDescription() {
	
		return description;
		
	}

	public void setCost(double newCost) {
		
		cost = newCost;
		
	}

	public double getCost() {
		
		return cost;
		
	}
}*/

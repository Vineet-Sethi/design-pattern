package decorator;

public class PizzaMaker {
	
	public static void main(String[] args)
	{
		//The PlainPizza object is sent to the Mozzarella constructor and then to the TomatoSauce constructor
		
		/*Pizza plainPizza = new PlainPizza();
		Mozzarella moz = new Mozzarella(plainPizza);
		Pizza decoratedPizza = new TomatoSauce(moz);*/
		
		Pizza decoratedPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredients: " + decoratedPizza.getDescription());
		System.out.println("Price: " + decoratedPizza.getCost());
	}
}
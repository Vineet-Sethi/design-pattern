package strategy;

public class AnimalPlay
{
	public static void main(String[] args)
	{
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: " + sparky.tryToFly());
		System.out.println("Bird: " + tweety.tryToFly());
		
		//Dynamically changing the capability later if the animal starts flying later in its life.
		sparky.setFlyingAbility(new ItFlys());
		System.out.println("Dog: " + sparky.tryToFly());
	}
}

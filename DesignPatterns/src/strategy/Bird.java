package strategy;

public class Bird extends Animal
{
	public Bird()
	{
		flyingType = new ItFlys(); //Set the flying behavior at instantiation. Setting birds as capable of flying.
		setSpeed(15);
	}
}

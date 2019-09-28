package strategy;

public class Dog extends Animal 
{
	public Dog() 
	{
		flyingType = new CantFly();  //Set the flying behavior at instantiation. Setting dog as a non-flying Animal.
		setSpeed(40);
	}
	
	/*
	 * BAD You could override the fly method, but we are breaking the rule that
	 * we need to abstract what is different to the subclasses
	 * 
	 * public void fly(){
	 * 
	 * System.out.println("I can't fly");
	 * 
	 * }
	 */
	
	public void digHole() {
		System.out.println("Dug a hole");
	}
}

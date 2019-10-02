package decorator;

//Has a "Has a" relationship with Pizza. This is an Aggregation Relationship
abstract class ToppingDecorator implements Pizza 
{
	protected Pizza tempPizza;
	
	//The decorator stores the instance of a Pizza. All decorators can dynamically customize PlainPizza instances because of this.
	public ToppingDecorator(Pizza newPizza)
	{
		tempPizza = newPizza;
	}
}
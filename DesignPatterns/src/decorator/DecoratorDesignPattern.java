/*
	DecoratorDesignPattern: Attach additional responsibilities to an object dynamically. Its an alternative to inheritance.
	
	So the scenario here is to decorate an object. And so the first point that comes to mind is that we must be receiving/storing the basic
	object to be decorated somewhere and then decorating it. This somewhere is an abstract decorator class. It stores the object in a 
	protected field and then decorates it - both via its implementors. By decorating we mean adding additional responsibilities or overriding 
	existing ones. 
	
	1. Now all that the decorators are supposed to do is to enhance the objects. And these objects although enhanced ones are still of
	   the basic type. So it makes sense to assume that these should also be extending from the same hierarchy as the basic object. 
	   
	2. The decorators have the basic object encapsulated inside them which makes it easy for them to make enhancements. Now they should have 
	   methods inside of them to manipulate/enhance the basic object behaviour. Since the decorators are enhancing the behaviour it seems like
	   that are themselves belonging to the basic object type hierarchy.
	    
	   Hence the abstract decorator also extends from the basic objects interface and its implementors implement the basic object methods 
	   Since the decorators contain the basic object itself, its easy for them manipulate these behaviours within the basic object methods
	   that they are implementing. 
	   
	3. Since every decorator can contain an object of type basic and every decorator itself is also a basic type object, we can pass one 
	   decorated object into the protected field of another decorator. This way we can additively add enhancements across decorators to a 
	   basic object dynamically.
	   
	   
	   Decorators have the same super type as the object they decorate.
	   Since decorators have same type as object, we can pass around decorated object instead of original.
*/
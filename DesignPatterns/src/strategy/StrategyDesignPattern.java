/*
 
   Strategy Pattern: Encode commonalities across subclasses in a different hierarchy.
   
   Core Problem: Suppose you have a superclass(Not an interface!) with 10 subclasses. Now lets say that tomorrow you want to 
   add a behaviour that is common to 7 of the 10 subclasses and the rest 3 dont need it. Lets see this with an example.
   
   We have an Animal class with 10 subclasses Dog, Cat, Cow and 7 different Birds. We are trying to figure out how to give the Birds type subclasses the 
   capability to fly. To simplify the scenario lets say we have 2 subclasses one is Dog(ie representing the ones that cant fly) and the other is Bird(ie 
   representing the ones that can fly).  
   
	1. The first thought that comes to mind is to add a fly method in the superclass Animal. But this would be wrong since Dog is also a subclass for 
	   Animal and it does not need such a fly method that describes how to fly. So by doing so we would force the Dog class to re-implement the fly 
	   method in such a way that probably negates the behaviour in the superclass. Also we must not add any method in a superclass that is not required
	   by a subclass and we must always encode commonalities in a superclass.

    2. The second idea would be that since we cant write a fly method in the superclass lets add it in the Bird classes itself. However if there are multiple 
       animals tomorrow then adding fly methods to all of them would result in code duplication. So we can neither add fly to superclass nor can we add it 
       to subclasses. It is here where it should trigger that the current hierarchy does not support our requirement efficiently and we need something different. 

    3. Now possibly we can create a seperate interface that declares a fly method and let individual animals implement it and figure out how they would fly.
       But this is not much different from declaring fly method in the Animal class and implementing concrete methods into various subclasses and again leads
       to code duplication. 

	Solution: We create an interface - Flys. This interface has several implementors that describe different fly behaviours. We use this interface as an 
	instance variable in the Animal superclass. Next we vary this instance variable in Animal subclasses depending on the Fly behaviour as required by the
	subclass. This way we dont effect either the Animal superclass or its subclasses. Hence the behaviour which was common to multiple Animal subclasses
	is now in one of the Fly implementors. And you have other implementations if certain subclasses need a different behaviour. 
	
	So essentially the behaviour that varied across subclasses is encapsulated into a separate interface hierarchy and tomorrow if more behaviours are needed
	cuz of more Animal subclasses being written, the interface can have new implementors and the code would scale easily.
	
	Definition: The Strategy pattern is to be used where you want to choose the algorithm to use at runtime. A good use of the Strategy pattern would be saving
	files in different formats, running various sorting algorithms, or file compression. So "essentially", the strategy pattern allows us to change the behavior 
	of an algorithm at runtime.
	
	The Strategy pattern provides a way to define a family of algorithms, encapsulate each one as an object, and make them interchangeable.
*/


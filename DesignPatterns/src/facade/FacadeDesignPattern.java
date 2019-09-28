/*
FacadeDesignPattern: Provide a simplified interface for the user that masks a complex system underneath.

You have a complex system. Complex implies that it is made up of several small subsystem each having their own functions. Sometimes you
may need the subsystems to work in tandem to a get functionality completed from the user point of view. For eg to withdraw cash
	1. The AccountNumberCheck subsystem checks if the account is active
	2. If AccountNumberCheck subsystem checks completes successfully then the SecurityCodeCheck subsystem checks if the entered code is 
	   correct
	3. If the SecurityCodeCheck verifies that a correct code is entered then the FundsCheck subsystem will check if the account has enough
	   cash
	
	In such a case you can't expect the client to know each and every subsystem working behind the scene and to instantiate all subsystems 
	and make them ready before he can withdraw cash. Instead you provide him a Facade. The Facade internally keeps all subsystems ready 
	whenever it is instantiated by the client. It then provides a convenience method withdrawCash to the client. When the client calls this
	method as all subsystems are ready by then it becomes easier to execute the entire functionality thereby hiding the inner complexities 
	of the system and provide a convenient access to the client,

Note: The core point in implementation of Facade pattern is to instantiate all subsystems in its constructor. And then in the facade functions
exposed to the client use the instantiated subsystems object references to execute user related functionality.

Another example: 
	 public ShapeMaker()   // Facade
	 {
      	this.circle = new Circle();         //Individual subsystems Circle, Rectangle, Square
      	this.rectangle = new Rectangle();
      	this.square = new Square();
     }
     
     public void drawCircle()
     {
      	circle.draw();                      //subsystem functionality called.
   	 }
     public void drawRectangle()
     {
      	rectangle.draw();
   	 }
     public void drawSquare()
     {
      	square.draw();
     }
     
*/
/*
https://www.journaldev.com/1491/bridge-design-pattern-java
 
 Bridge Design Pattern: In a many to many mapping between objects don't force all of them to fall in the same hierarchy. Instead create
 separate ones. Eg Shapes(Squares and Circles) OF multiple Colors(Red, Green or Blue) OR 
                   PaymentMethods(Netbanking or CreditCard) USING multiple PaymentGateways(IDBI or Citrus) 
                   
 If we don't use Bridge Pattern we end up in an inheritance type hierarchy that is tightly coupled. Lets assume that we need to draw 
 different shapes such as Triangle and Square and fill them with different colors. Our typical approach would be to create an interface
 Shape and implement it with Triangle and Square implementations. Now, let’s say we want to fill them with Red and Blue colors. As a 
 typical programmer we take the next step of creating different classes of Triangle and Square with colors which is nothing but inheritance.
 Now, if we need to fill them with Red and Blue colors we create RedTriangle, BlueTriangle and RedSquare and BlueSquare etc. 

 This approach works fine however it complicates the extension as things are tightly coupled here and we would want to decouple the
 abstraction with the implementation.
 
 In the example here we have RedCircle and GreenCircle implementations. These implementations know in totality how to draw a circle and
 they know where to draw it, its radius and color etc. They extend from the drawAPI interface and hence you have decoupled them from the
 original design that uses extensive inheritance. Next comes the abstractions. First we have an abstract class that contains a reference
 to the implementor. It knows nothing about draw and as such the method is abstract. Next we have the refined abstraction of the circle 
 that just supplies the coordinates and the radius values and in a way it provides data to the concrete implementors to enable them to draw
 a circle.
  
 */

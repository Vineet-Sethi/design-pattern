package factory;
/*

Factory Pattern - Instantiate a subclass on the fly.

You have a hierarchy of classes - a base class with its few subclasses. You need to create these subclasses dynamically on demand.

1. The most basic approach would be to instantiate the exact type you want in the client class. But that would not be dynamic at all. Its
   hard coded in the client class and no matter how many times you run this code it will generate the same exact type.
2. Second is ask for type of subclass required to be instantiated from the user itself by using Scanner(System.in). So the user supplies
   an alias for the subtype he wants to create and you write if-else code to provide him the subtype object. This is fine and dynamic
   but you are writing everything in the client class and as such breaking the OCP principle and probably the SRP too. So 
   tomorrow if new types are added you need to add more if-else to the client class. 
3. You move the object creation responsibility to a different class altogether. This class has a method that accepts a string alias for 
   the type you wanna create and returns then desired subtype object. It hands the newly created object in a reference of the superclass
   type. This class now acts as a factory class and you do not break the SRP ie object creation in this case. The OCP as well is followed as if tomorrow
   more subtypes are needed you are only adding if-else code.
   
Note: We can keep Factory class as a Singleton and keep the method that returns the subclass as static.

*/
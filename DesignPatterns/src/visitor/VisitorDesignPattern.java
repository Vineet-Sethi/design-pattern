/*
Visitor Design Pattern: "Refactor" a contract behaviour implemented differently in subclasses into another class. 

The visitor is used when we have to perform an similar operation on a group of sub-classed Objects. With the help of visitor pattern, we can
move the operational logic from the objects to another class.

So basically we want to "move" a behaviour implemented in subclasses into a different class - the visitor. Lets say we have an Item interface with
multiple subclasses and lets say the int calculateCost() method has to be moved. Since various subclasses implement it differently
the first thought that comes to mind is that the moved method would be a big one that has all the implementations of all the subclasses.

Next it is intuitive that there would be a lot of if statements in that method, checking for subclass instance type(instanceof operator)
and then the statements for cost calculation will be executed for that type. This triggers that the moved method should have an argument
of type Item. The received Item type is checked in the if-else-if block and the corresponding cost calculation is done. This clearly is
not a good refactoring technique cuz of lot of if-else-if code and also cramming lots of logic into a single method.

Since there are multiple implementations we can overload the method with different subclass types as argument in the overloaded versions. 
To be able to invoke these methods we need a reference of the visitor class in all our subclasses so that they are able to call 
their corresponding overloaded version. This reference is provided as an argument to the method calling the other class overloaded methods.
So now all our subclasses have a method which has that other class reference as an argument and it calls the corresponding overloaded 
method of the other class by passing itself(this). The correct version of the overloaded method gets called when "this" is resolved at
runtime.

*/
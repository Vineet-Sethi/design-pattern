/*

StateDesignPattern: An object whose behaviour changes as per the value of a field(state) in it.

Now by definition the first approach that comes to mind is as below"
1. Lets say a class has a field and a setter for that field. The class has a method(behaviour) that uses if-else code to check the value
   of the field and provide different behaviours. 
   The State pattern is used to provide a systematic and loosely-coupled way to achieve this through Context and State implementations.
   
2. First of all you need a state variable whose value will be changed at runtime. The value would be the object provided to this variable
   at runtime and the corresponding behaviour will be called on the supplied object - standard polymorphism. Thus the state variable will
   be an interface with multiple implementors describing different behaviours.
   
   Next you encapsulate this variable in a class. It is this class whose behaviour will appear changed for a client when it provides 
   different values to the state variable. You can instantiate one of the implementors as default within the constructor of the encapulating
   class and assign it to the state variable. And you will also provide a setter for this variable. Then some method in this class will 
   use the state variable to call its behavior. 
   
   Now the catch lies in the encapsulating class' method using the state variable. When you call the state variables method you pass the
   reference of the encapsulating class as an argument to the method using 'this' (which by the way means that you would have implemented
   the state implementations using the same signature in the first place). We do this because we will use the reference of the encapsulating 
   class to call its setter. This is required sometimes to set the state variable to point to the next state after the current behaviour 
   has finished executing for eg in case of a State Machine.Also oing this way seems like an automatic chnageover to the next state while
   executing the current state.
    
 */

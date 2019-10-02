package state.pattern;

/*
	An object whose behavior changes depending on the value of a field in it!
	State design pattern implements polymorphic behavior that is clearly visible. Its easy to add more states for additional behaviors.
	State pattern removes if-else code by using polymorphism hence making our code more maintainable, robust and flexible.
 */
public class StatePattern
{
    public static void main(String[] args) 
    {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();        
    }
}

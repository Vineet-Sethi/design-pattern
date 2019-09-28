/*

 Proxy Pattern: Limit the access to a critical object.
 
 This pattern is used to limit access to another class. This may be needed because of security reasons or because the object is accessed from a remote 
 location.
 
 Implementation Steps
 1. This pattern is about limiting access to an object's functionality. So the first natural question is what functionality is accessible and
    what is restricted. So after deciding on this an interface can be exposed for the high security object and declare the functions that are
    supposed to be accessible.
 2. Now since we are exposing an interface why can't we give this interface reference to the client to use. The interface reference
    will hold the real object's reference but will anyhow only show methods that are defined in the interface and not the others. The problem 
    here is that the interface reference can be casted to the concrete object and as such all other methods which were not intended for client
    usage will also be exposed. Hence this is not an option. We can never give the critical class object to the client by any means.
 3. Hence we create a proxy class which also implements the interface exposed by the critical object. But proxy class does have not have the
    actual functionality and has to somehow invoke the core objects functions. We can now give the proxy object to the client, hence the
    critical object is safely isolated from client access.
    
    Like the adapter we could have had the critical objects reference inside the proxy class but again due to security reasons we never allow 
    the critical object to be "stored" inside the proxy neither by composition nor by aggregation. It is only instantiated within proxy method 
    implementations on demand and the relevant functions are called on the fly. 
*/
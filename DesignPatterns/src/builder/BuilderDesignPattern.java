/*
 BuilderDesignPattern: Creation of a complex object - remove the constructor and define construction contract.

 The requirement is to create a complex object(called product) by separating the construction from its representation. Separating 
 construction from its representation implies removing the construction process from the complex objects class(the representation).
 The construction responsibility is given to another entity known as the builder. 

 So we create a builder interface where we specify generic steps to create the product. It also provides a getter to return the product
 object. Now concrete builders are implemented for this interface to build various representations of the product. These builders compose 
 the product in their constructor and assign it to the private reference of the product that they hold. This reference is then used to call
 the setters in the actual product class.

 We have a director which controls the algorithm that generates the final product object. This algorithm is defined in the directors
 construct method. The directors constructor has an argument to capture the specific concrete builder object that specifies the actual 
 kind of representation to be constructed. 

 A client can then instantiate the director with the intended concrete builder supplies as an argument. It then calls the construct 
 method of the director to generate the product object. On completion of the process, a getProduct method of the director that internally
 calls getProduct method of the builder object is used to return the product. 
	
*/
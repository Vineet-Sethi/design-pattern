/*

Adapter Design Pattern: Fit a similar object in an existing hierarchy.

In the implemented scenario there was an EnemyAttacker interface and this interface had an EnemyTank implementor. These 2 were happily 
coexisting as a hierarchy in your application. At some point in time you coded a class EnemyRobot. This class also did similar things as the
EnemyTank but in a completely different way. You thought how can I fit this new object into the existing Interface-Implementor hierarchy.

The whole idea is to map the methods defined in the interface with the methods of the EnenmyRobot class. A first thought would be since the
methods of the Robot are doing similar things as any EnemyAttacker interface why not change method names of the EnemyRobot class. This is 
not good to do as then the methods would not look as if belonging to a Robot. Moreover existing clients using the EnemyRobot class will have
problems and need to be updated. Hence you write an adapter "to connect the 2 - the EnemyRobot class and the EnemyAttacker - EnenmyTank hierarchy

The new EnemyAdapter class implements the EnenmyAttacker interface. So it has to code all interface methods. It does it cleverly by pointing them 
to the actual methods of the EnemyRobot class. And for this it contains(initialized via constructor) the EnemyRobot class instance to call 
actual methods.
 
*/ 
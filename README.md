# SOLID_Principles
Just learning SOLID principles


## Single Responsibility Principle

  it is a separaty of all “responsibilities” in the
only class. So we should create such of class that is going attendent a
single responsibility that will be working only in your class. Principle like
this prevent you to change any features in a class where contain more
responsibility, and get error unexpected way which can affected other
different component that depend on the changed class.



<img title="a title" alt="Alt text" width="55%" style="display: block; margin: 0 auto" src="https://github.com/Heberty123/SOLID_Principles/blob/master/SRP.png">


## Open & Closed Principle 

  it is such an entity allow be open for extension your behaviours, but closed for modify its source code. So, if you have to implement new feature at the especific class, you should keep the existing code from it class and to do principle “inheritance” which allows a class to share behaviours for child class. This way, you can add new feature at this class that is daughter from the last class. In general, the class father can be instantiaded by itself or by child class that have new behaviours.

this principle prevents negative impact drastically for all class that depends on each other class, making the software safely, robust and accepted for maintance.





## Liskov Substitution Principle

  “I am your enhanced version”

this principle requires object of subclass to behave is same may than object of superclass, for example, the object of the class S extends the object of the class T and use all behaviours of this object T. Thus, the Object T can be replaced by object S without breaking the application. 



## Interface Segregation Principle


  On some occasion, We wouldn’t like to extends all behaviours that won’t be used by subclass. So, it’s best for the class to implements especif interface rather than generic interface that contain useless method. For better example, when we create interface bird and all class as toucans, hawk, owl and penguin implements that class which contain function like eat(), sleep() and fly(), but penguin doens’t fly ! it break our application, like also the liskov principle. So, we should create interface bird with function only eat() and sleep(). So other interface will be bird_that_fly  and this interface contain function fly() and extends interface bird. Like this, penguin can implements interface bird and others birds can implements interface bird_that_fly. 
  
  
  
## Dependency Inversion Principle

__high level modules should not depend on low level modules; both should depend on abstractions. Abstractions should not depend on details. Details should depend upon abstractions.__

We wouldn’t like the our class to be coupled by instantianting other dependency into this class. So, we should inject dependecy into class by method construct, without instantiad in that class. But for to do it, we have to abstract between our high-level and low-level.

High-level: is the class that need an tool (dependency) for doing anything 
low-level: is (dependency) an tool that can be used by class.

Interface: abstract our class and tools.

Details of tools: especific tool can implements that interface for make your different details.
Fire


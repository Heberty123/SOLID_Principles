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



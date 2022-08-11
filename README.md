# SOLID_Principles
Just learning SOLID principles

Hi everyone, in this post, I’d like to show you the principles of SOLID with images that I made to allow you undestood may easily about such a principles in SOLID.

<img alt="Conding" src="https://www.bing.com/images/search?view=detailV2&ccid=w7EGekd6&id=2410C98C2B6464892D73A64D0725D0E136316B82&thid=OIP.w7EGekd6r1ZUMlL_1bYOuQHaHf&mediaurl=https%3A%2F%2Fi.pinimg.com%2Foriginals%2F55%2F85%2F21%2F558521d1b308796d13feedcf603927dd.jpg&cdnurl=https%3A%2F%2Fth.bing.com%2Fth%2Fid%2FR.c3b1067a477aaf56543252ffd5b60eb9%3Frik%3DgmsxNuHQJQdNpg%26pid%3DImgRaw%26r%3D0&exph=683&expw=675&q=hello+gif&form=IRPRST&ck=774A1BA46129CAE905B18E44FCD5F780&selectedindex=2&ajaxhist=0&ajaxserp=0&pivotparams=insightsToken%3Dccid_VBnJzj%252F6*cp_376EC7646ABBC23D99DA931B02517031*mid_E94BE5B628140B8206500C3818A1331D8B8A7CEE*simid_608046298717647147*thid_OIP.VBnJzj!_63kOyg32qLJax2QHaHa&vt=0&sim=11&iss=VSI&ajaxhist=0&ajaxserp=0">

Here, we’ll use “class” as software entity to apply ours principles SOLID, but we also can use function, method or module.



## Single Responsibility Principle

  it is a separaty of all “responsibilities” in the
only class. So we should create such of class that is going attendent a
single responsibility that will be working only in your class. Principle like
this prevent you to change any features in a class where contain more
responsibility, and get error unexpected way which can affected other
different component that depend on the changed class.



<img title="a title" alt="Alt text" align="center" width="65%" style="display: block; margin: 0 auto" src="https://github.com/Heberty123/SOLID_Principles/blob/master/SRP.png">





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


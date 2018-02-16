By working through individual design patterns, you will learn how to design objects that are easier to implement, change, test, and reuse.

Builder DP.
Problem.

Design : 
* How.....can a class create different representations of itself.
* move from complex object to simplified one

Refactoring : 
* How.......can a complex object, be simplified.
* move from complex code to simpler code


What is a complex object ? 
* It is one whose representative class contains many properties & operations. 
* It could be an object that is made up of many additions. Such as your car object.


What are the existing construction mechanisms?
An object is initialized by its setters, and constructors. 
If a class has many properties, the constructor becomes quite long, and telescopic version of the constructor will exist.


Its fundamentally a separation of duty!!! 
* the client should not be concerned with constructing the object, they just want to use it. If the object was simple the client could handle it.
* Bring in the professionals, hire a foreman, hire a builder, and instruct the foreman accordingly, he will in turn will give you representations of the object as you desire.








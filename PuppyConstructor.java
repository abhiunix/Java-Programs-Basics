/*
 Every class has a constructor. 
 If we do not explicitly write a constructor for a class, the Java compiler builds a default constructor for that class.

Each time a new object is created, at least one constructor will be invoked.
The main rule of constructors is that they should have the same name as the class.
A class can have more than one constructor.

*/
public class PuppyConstructor {
   public PuppyConstructor() {
   }

   public PuppyConstructor(String name) {
      // This constructor has one parameter, name.
   }
}
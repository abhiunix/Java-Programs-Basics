/*
Creating an Object
As mentioned previously, a class provides the blueprints for objects. 
So basically, an object is created from a class. 
In Java, the 'new' keyword is used to create new objects.

There are three steps when creating an object from a class −
Declaration − A variable declaration with a variable name with an object type.
Instantiation − The 'new' keyword is used to create the object.

Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
*/
public class PuppyObject {
   public PuppyObject(String name) {
      // This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name );
   }

   public static void main(String []args) {
      // Following statement would create an object myPuppy
      PuppyObject myPuppy = new PuppyObject( "tommy" );
   }
}
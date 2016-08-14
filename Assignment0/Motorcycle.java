//filename Motorcycle.java
class Motorcycle {
   static String numWheels = "two";     // class variable
   String make;
   String color;        // these are three instance variables
   boolean engineState;
   
   void startEngine() { //class method/behavior
      if (engineState == true)
         System.out.println("The engine is already on.");
      else {
         engineState = true;
         System.out.println("The engine is now on.");
      } // end if
   }    //end method startEngine
   
   void showAtts() {
      System.out.println("This motorcycle is a "
         + color + " " + make + ".");
      if (engineState == true)
         System.out.println("The engine is on.");
      else
         System.out.println("The engine is off.");
      System.out.println("The number of wheels is "
         + numWheels + ".");
   }    //end method showAtts
   
   public static void main(String args[]) {
      
      // here we create an instance of class Motorcycle
      // as an object called scooter.
      // Remember, we create an object of a class
      // and then call methods that are members of the class
      Motorcycle scooter = new Motorcycle();
            
      // here we give our instance variables a value
      // this becomes an "attribute" of our instance variables.
      scooter.make = "Yamaha 650";
      scooter.color = "blue";
      
      System.out.println("Calling showAtts...");
      scooter.showAtts();       //call a class method, shows values
                                //of our instance variables
      System.out.println("------");
      System.out.println("Starting Engine...");
      scooter.startEngine();
      
      System.out.println("------");
      System.out.println("Calling showAtts...");
      scooter.showAtts();
      
      System.out.println("------");
      System.out.println("Starting Engine...");
      scooter.startEngine();
   }    //end method main
}       //end class Motorcycle
 

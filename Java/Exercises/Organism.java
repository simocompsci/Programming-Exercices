public class Organism {
    // we will use this class to demonstrate polymorphism
    // its obvious : * we first inherit from a class
    //               * override its method
    //               * when we call it in the object we can use any class that has the same method we want 
    //                 and it will work
    // we wan also use polymorphism with interfacse

    // Then there is runtime polymorphism wich is when a method that gets executed is defined at runtime
    // based on the actual type of the object (for example we ask the user to chose wich class he wants then use object based on it)
    
    void developpement(){
        System.out.println("The organism is devolopping by consumming nuttrients");
    }
        
    
}

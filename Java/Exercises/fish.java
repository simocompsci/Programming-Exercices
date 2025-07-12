public class fish implements  Predator , Prey {
    // in this class we inherit from both interfaces (Prey , Predator) so that 
    // we can acces their methods and override them and use them n our objects
    // it allows one object to have methods of different interfaces
    @Override
    public void flee(){
        System.out.println("the fish is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("the fish is huntting your ass");
    }
}

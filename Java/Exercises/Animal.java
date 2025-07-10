
public class Animal {
    // the static keyword is a variable that belongs to the class instead of the constructors and is available for 
    // for all constructors and child classes

    static int  numOfCups = 1;


    String type;
    String species;
    int weigth;

    // public Animal() { // we can put default values
    //     type = "mamel";
    //     species = "felines";
    //     weigth = 55;
    // }

    public Animal(String type , String species , int weigth ) {
        this.type = type;
        this.species = species;
        this.weigth = weigth;
        numOfCups++;
    }

    

    

    void  move(){
        System.out.println("This " + type + " is a " + species + " and weighs over " + weigth); 
    }

}

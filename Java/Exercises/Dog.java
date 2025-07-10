public class Dog extends Animal {
    // when we have in the mother class only default values and not defined ones with the constructor we can inherit directly 
    // but when we have attributes inside the constructor we should use the super keyword
    
    String owner;
    String name;

    Dog(String type , String species , int weigth , String owner){
        super(type, species, weigth);
        this.owner = owner;
    }

    

    
    // Now we will tackle overlowded contructors : this is a concept that allows a class to have multiple contructors 
    // but they should have different number of parameters to make objects be initialized in various ways 
    // the constructors gets used based on the number of arguments provided
    // we can create a constuctor that takes no arguments and only has default values

    public Dog(String name) {
        super(null, null, 0);
        this.name = name;

    }

    void dogName(){
        System.out.println("the dogs name is " + this.name);
    }


    @Override
    void  move(){
        System.out.println("the dog  is getting walked by his owner "+ this.owner+ " in the backyard" );
    }
    
}

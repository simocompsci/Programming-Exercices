
public class OOPLearning {
    public static void main(String[] args) {
         // 0bject = An entity that holds data (attribute)
        //          and can perform actions (methods)
        //          It is a reference data type

        // Car car = new Car();
        // car.price = 300000.55;
        // System.out.println("\n" + car.maker);
        // System.out.println("\n" + car.price);
        // car.descritpion();

        // Student student1 = new Student("mohammmed" , 20 , 3.2 , true);
        // Student student2 = new Student("hassan" , 30 , 3.5 , false);
        // System.out.println(student1.name + " " + student1.age);
        // System.out.println(student2.name + " " + student2.age);


        // student1.study();

        // Dog dog = new Dog();
        // dog.move();

        // Dog dog = new Dog("hhhhh" , "ggggg" , 55 , "simo");
        // dog.move();

        Dog dog = new Dog("buddy");
        // the way to access a static variable
        System.out.println(Animal.numOfCups); // we can either chose the name of the mother class or the child one
        // dog.dogName();

        // Array of objects 

        Dog dog1 = new Dog("malenois", "bitches", 23, "carlos");
        Dog dog2 = new Dog("pitbull", "bitches", 30, "hanan");
        Dog dog3 = new Dog("sheperd", "non bitches", 22, "miguel");

        Dog[] dogs = {dog1 , dog2 , dog3};
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].move();
        }

        for(Dog item : dogs){
           item.move(); 
        }
        


        
       
    }
}

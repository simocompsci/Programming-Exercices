
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
        // Dog dog = new Dog("buddy");
        // the way to access a static variable
        // System.out.println(Animal.numOfCups); // we can either chose the name of the mother class or the child one
        // dog.dogName();
        // Array of objects 
        // Dog dog1 = new Dog("malenois", "bitches", 23, "carlos");
        // Dog dog2 = new Dog("pitbull", "bitches", 30, "hanan");
        // Dog dog3 = new Dog("sheperd", "non bitches", 22, "miguel");
        // Dog[] dogs = {dog1 , dog2 , dog3};
        // for (int i = 0; i < dogs.length; i++) {
        //     dogs[i].move();
        // }
        // for(Dog item : dogs){
        //    item.move(); 
        // }
        // fish fish1 = new  fish();
        // fish fish2 = new  fish();
        // fish1.flee();
        // fish2.hunt();

        // This is how polymorphism works
        // Organism organism1 = new Organism();
        // Animal animal1 = new Animal("other animals");
        // Human human1 = new Human("vegetables and meat");
        // Plant plant1 = new Plant("minerals");
        // organism1.developpement();
        // animal1.developpement();
        // human1.developpement();
        // plant1.developpement();

        // if we want t create an array of objects with polymorphism we define the type as the mother class
        // then we loop over them as always

        // Organism[] organisms = {organism1 , animal1 , plant1 , human1};
        // for(Organism organism : organisms){
        //     organism.developpement();
        // }

        Employee employee = new Employee("mohammed", "developper", 100000);
        // System.out.println(employee.Name); // we we write this code without getters it says its not visible because it has 
        // private access
        System.out.println(employee.getName());
        System.out.println(employee.getJobTitle()); // Now when to access the attributes we call the get... functions
        System.out.println(employee.getSalary());
        employee.setName("hassan");
        employee.setJobTitle("devops engineer");
        employee.setSalary(500000);
        System.out.println(employee.getName());
        System.out.println(employee.getJobTitle()); // Now when to access the attributes we call the get... functions
        System.out.println(employee.getSalary()); // its the same object but with the use of setters we could change the attributes 
                                                  // values

    }
}

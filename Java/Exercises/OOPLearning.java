
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

        Student student1 = new Student("mohammmed" , 20 , 3.2 , true);
        Student student2 = new Student("hassan" , 30 , 3.5 , false);
        System.out.println(student1.name + " " + student1.age);
        System.out.println(student2.name + " " + student2.age);


        student1.study();


        
       
    }
}

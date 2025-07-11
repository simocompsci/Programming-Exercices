public class Employee {
    // getters and stters are usually used with objects of classes that have private attributes
    // GETTERS : to make a field or attribute readable
    // SETTERS : to make a field or attribute writeable(modifiable)

    private String Name;
    private String JobTitle;
    private int Salary;

    public Employee(String Name, String JobTitle, int Salary) {
        this.Name = Name;
        this.Salary = Salary;
        this.JobTitle = JobTitle;
    }

    String getName(){
        return this.Name;
    }

    String getJobTitle(){
        return this.JobTitle;
    }

    int  getSalary(){
        return this.Salary;
    }

    void setName(String Name){
        this.Name = Name;
    }

    void setJobTitle(String JobTitle){
        this.JobTitle = JobTitle;
    }

    void setSalary(int Salary){
        this.Salary = Salary;
    }

    
    


}

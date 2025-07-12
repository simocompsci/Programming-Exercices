public class Plant extends Organism{

    String nutrients;

    public Plant(String nutrients) {
        this.nutrients = nutrients;
    }


    @Override
    public  void developpement(){
        System.out.printf("the plant is developping by consumming %s \n" , this.nutrients);
    }
}

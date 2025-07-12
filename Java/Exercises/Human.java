public class Human extends Organism{

    String nutrients;

    public Human(String nutrients) {
        this.nutrients = nutrients;
    }
    @Override
    public  void developpement(){
        System.out.printf("the human is developping by consumming %s \n" , this.nutrients);
    }
}


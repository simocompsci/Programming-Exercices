package Java.DesignPatterns;

public class Chargeur implements IChrageable {
    private IChrageable telephone;
    private int voltage;

    @Override
    public void Recharge(int voltage){
        System.out.println("the voltage is " + this.voltage);
    } 

    void BrancherPortable(IChrageable chrageable){
        
    }
}

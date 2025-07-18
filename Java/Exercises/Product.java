public class Product<T , U> {
    T name;
    U price;

    public void  setName(T name){
        this.name = name;
    }

    public void  setPrice(U price){
        this.price = price;
    }

    public T getName(){
        return this.name;
    }

    public U getPrice(){
        return this.price;
        
    }

    // we can use this method or use the one with the constructor (comeback later for this)
}

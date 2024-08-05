package single_level_inheritance_parent;

public class Apple extends Fruit {

    int price=89;

    public void printPrice(){
        System.out.println(price);
    }

    public static void main(String[] args) {
        
        Fruit f=new Fruit();
        f.printRegion();

        Apple a=new Apple();
        a.printPrice();
    }
    
}

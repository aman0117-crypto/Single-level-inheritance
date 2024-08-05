package single_level_inheritance_parent;

public class Power extends Num{

    public  double square(int a){
        n=a;
        return a*a;
    }
    public  double cube(int a){
        n=a;
        return a*a*a;
    }

    public static void main(String[] args) {
        Power p=new Power();
        System.out.println("The square is: "+p.square(2));
        System.out.println("The cube is: "+p.cube(2));
    }
    
}

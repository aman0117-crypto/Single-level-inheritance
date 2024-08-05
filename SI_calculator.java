package single_level_inheritance_parent;

public class SI_calculator extends Customer {
    public double si(double a,double b,double c){
        this.p=a;
        this.t=b;
        this.r=c;
        return ((p*t*r)/100);
    }

    public static void main(String[] args) {
        SI_calculator s=new SI_calculator();
        System.out.println(s.si(500, 2, 5));
    }
    
}

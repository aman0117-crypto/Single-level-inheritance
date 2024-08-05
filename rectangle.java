package single_level_inheritance_parent;

public class rectangle extends measurement {
    public double area(){
        return e*w;

    }
    public double perimeter(){
        return (2*(e+w));
    }


    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.out.println("The area of rectangle is: "+r.area());
        System.out.println("The perimeter of rectangle is: "+r.perimeter());
        
    }
    
}

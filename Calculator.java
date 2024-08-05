package single_level_inheritance_parent;

public class Calculator extends Number{

    public double sum(){
        return n1+n2;
    }
    public double sub(){
        return n2-n1;
    }
    public double mul(){
        return n1*n2;
    }


    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println("The sum of two numbers are: "+c.sum());
        System.out.println("The subtraction of two numbers are: "+c.sub());
        System.out.println("The multiplication of two numbers are: "+c.mul());
        
    }
    
}

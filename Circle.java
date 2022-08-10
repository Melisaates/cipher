import java.util.Scanner;
public class Circle {
    double r;

    Circle(double r){
        this.r=r;
    }
    public double getArea(){
        return r*r*Math.PI;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("sayı gir");
        double r=s.nextDouble();
        Circle c=new Circle(r);
        //double area=r*r*Math.PI;
        System.out.println("alan=%f"+c.getArea());
    }
}

    



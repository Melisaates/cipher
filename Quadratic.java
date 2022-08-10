/**
* BIL122 - Lab 02
* Explain briefly the functionality of the class.
* @author Melisa Ateş, atesmel12@gmail.com
* 18.03.2021
*/
import java.util.Scanner;
public class Quadratic {
   // The rest of your code will all go here.
   double a,b,c;
   double x1,x2;
   
   
   //getter setter
   
  
  public double getX1(){
    return x1;
  }
  public double getX2(){
    return x2;
  }
  public double getDiscriminant() {
     return b*b-4*a*c;
   } 
  public Quadratic(double a, double b, double c) {
    this.a=a;
    this.b=b;
    this.c=c;
    double d=getDiscriminant();
    this.x1 = (-b + Math.sqrt(d))/(2*a); //d discriminant
    this.x2 = (-b - Math.sqrt(d))/(2*a); //d discriminant
  }
    
  
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("sayı gir");
    
    double a=scanner.nextDouble();
    double b=scanner.nextDouble();
    double c=scanner.nextDouble();
    
    Quadratic q=new Quadratic(a,b,c);
    
   
    System.out.println("x1:" + q.getX1());
    System.out.println("x2:" + q.getX2());


  }
}

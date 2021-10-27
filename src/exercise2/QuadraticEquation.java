package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a,b,c:");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double x1;
    double x2;
    double x;
    double D;

    if(a != 0){
      D = b*b - 4.0*a*c;
    if (D>= 0)
    {
      x1 = (-b + Math.sqrt(D))/2*a;
      x2 = (-b - Math.sqrt(D))/2*a;
      System.out.println(x1 + ", " + x2);
    }
   else {
     System.out.println("Imaginary values");
     }
    }
     else if(b != 0) {

       x = (0 - c)/b;
       System.out.println(x);
       } else if(c != 0) {
         System.out.println("No values");
       } else if(c == 0) {
           System.out.println("Many values");
       }
     input.close();

  }
}







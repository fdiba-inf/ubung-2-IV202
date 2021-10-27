package exercise2;

import java.util.Scanner;

public class DayOfWeek {


  public static void main(String[] args) {
    int a;
  
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    switch(a) {
      case 1:
    System.out.println("Day of week:Monday");
    break;
    case 2:
    System.out.println("Day of week:Tuesday");
    break;
    case 3:
      System.out.println("Day of week:Wednesday");
      break;
    case 4:
      System.out.println("Day of week:Thursday");
      break;
    case 5:
      System.out.println("Day of week:Friday");
    break;
    case 6:
    System.out.println("Day of week:Saturday");
    break;
    case 7:
    System.out.println("Day of week:Sunday");
    break;
    default:
    System.out.println("Day of week:Invalid day");
    break;
    }
   input.close();
 } 
}   
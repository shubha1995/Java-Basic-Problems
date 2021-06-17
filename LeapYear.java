package javaPrograms;

import java.util.Scanner;
public class LeapYear{
  public static void main(String [] args){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter year");
    Integer input = obj.nextInt(); 
    String year = input.toString();
    if(year.length() == 4){
      if(input % 4 == 0){
        System.out.println("Divisible by 4");
        if(input % 100 != 0){
          System.out.println("and not divisible by 100");
          System.out.println("\n" +input+ "is a LEAP year");
        }else if(input % 400 == 0){
          System.out.println("and divisible by 100");
          System.out.println("but also divisible by 400");
          System.out.println("\n" +input+ "is a LEAP year");
        }
      }else{
        System.out.println("Not divisible by 4");
        System.out.println("\n" +input+ "is NOT a leap year");
      }
    }else{
      System.out.println("Invalid year, enter a year 1000 onwards");
    }

  }
}

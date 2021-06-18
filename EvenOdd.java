package javaPrograms;


public class EvenOdd
{
  public static void main(String args[])
  {
    
   
    System.out.println("Enter a number:");
    int num = Utility.getUserSpecificInteger();

    if ( num % 2 == 0 )
        System.out.println("The entered number is even");
     else
        System.out.println("The entered number is odd");
  }
}

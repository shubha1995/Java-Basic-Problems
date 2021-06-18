 package javaPrograms;
 
 public class FlipCoin{
   public static void main(String [] args) {
     int tail = 0;  
     int head = 0;

     System.out.println("Enter a number: ");
     int myNum = Utility.getUserSpecificInteger();
     double copyNum = myNum;  
     if(myNum > 0){
       for(int i=myNum ; i>0 ; i--){
         double randomValue = Utility.getRandomDouble();   
         if(randomValue<0.5){
           tail = tail + 1;
         }else{
           head = head + 1;
         }
       }
       double percentTail = (tail/copyNum)*100;
       double percentHead = (head/copyNum)*100;
       System.out.println("Probability of heads: " +percentHead+ "%");
       System.out.println("Probability of tails: " +percentTail+ "%");
     }else{
       System.out.println("Invalid number");
     }

   }
 }

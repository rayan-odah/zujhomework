package edu.zuj.hw;



import java.util.Scanner;




public class Primeornot {
    
   
   public enum enprimeornot{prime,notprime}
   
   public static enprimeornot primary(int number){
    if(number<2){
        return enprimeornot.notprime;
    }
         int prchack=Math.round(number/2);
         for(int i=2;i<=prchack;i++){
             if(number%i==0){
                 return enprimeornot.notprime;
             }
         }
         
       return  enprimeornot.prime;
         
         
   }
   
   
    public static int readnumber(String message){
      
        Scanner input=new Scanner(System.in);
        int number;

        System.out.println(message);
        number =input.nextInt();
        return number;
    }
    
    public static void main(String args[]) {

        int number=readnumber("enter number");
        
        
        
      if(primary(number)==enprimeornot.prime)
          System.out.println("its primary");
      else 
          System.out.println("not primary ");
 }
    
}

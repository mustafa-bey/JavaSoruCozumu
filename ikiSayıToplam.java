import java.util.*;
 
//iki sayının toplamı 

public class ikiSayıToplam { 
    public static void main(String[] args) {

    int number1,number2,sum;
    Scanner input=new Scanner(System.in);
    
    System.out.print("enter a number:");
    number1=input.nextInt();
    
    System.out.print("enter a number:");
    number2=input.nextInt();

    sum=number1+number2;
       
    System.out.print("sum of  numbers:"+sum);

    }
}





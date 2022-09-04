import java.util.Scanner;
 
 
public class BasamakKupToplamı {
  
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a number ");
 
        int num = reader.nextInt();
 
        int x = 0;
        int sum=0;
 
        while(num != 0)
        {
           sum=(num%10)+sum;
           num /= 10;
            ++x;
        }
 
        System.out.println("answer = "+sum);
    } 
}
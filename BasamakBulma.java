import java.util.Scanner;
 
public class BasamakBulma {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        
        System.out.print("enter a number ");
        int number = scanner.nextInt();
        
        while(number>0) {
            number=number/10;  
            counter++;
        }
        System.out.println("answer = " + counter);
    }
}
import java.util.Scanner;
 
public class ObebBulma {
    //EBOB
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int ebob = 0;
        
        System.out.print("Enter a number 1 ");
        int num1 = scan.nextInt();
        System.out.print("Enter a number 2 ");
        int num2 = scan.nextInt();
        
        for(int i = 1; i < num1; i++)
        {
            if(num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = "+ebob);
    }
}
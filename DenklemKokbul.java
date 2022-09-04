import java.util.Scanner;
 
 
public class DenklemKokbul {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("(ax²+bx+c) is a quadratic equation Enter the constants in the equation in order as follows"); 
        
        System.out.print("a değerini giriniz :"); 
        double a = scanner.nextInt(); 
        System.out.print("b değerini giriniz   :"); 
        double b = scanner.nextInt(); 
        System.out.print("c değerini giriniz   :"); 
        double c = scanner.nextInt(); 
        //diskriminant (delta)
        double delta = (b * b) - (4 * a * c); 
        
        if (delta > 0){ 
            double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
            double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
            System.out.println("x1= " + x1 + " x2= " + x2); 
        } 
        if (delta < 0){
            System.out.println("Equation Has No Real Root"); 
        } 
        if (delta == 0){ 
            double x = (-1 * b) / (2 * a);
            System.out.println("has coincidence root x1= x2= " + x); 
        }
 
    } 
}
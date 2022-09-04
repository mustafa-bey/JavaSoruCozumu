import java.util.Scanner;
 
public class UcgenAlanHesaplama {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int edge1,edge2,edge3,area,u;
        
        System.out.print("1. Kenarı giriniz: ");
        edge1 = scan.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        edge2 = scan.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        edge3 = scan.nextInt();
        
        u = (edge1+edge2+edge3)/2;
        area=(int) Math.sqrt(u * (u-edge1) * (u-edge2) * (u-edge3));
        System.out.println("area of triangle = "+area);  
    }
}
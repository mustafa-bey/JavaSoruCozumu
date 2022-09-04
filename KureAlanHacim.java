import java.util.Scanner;

public class KureAlanHacim {
    public static void main(String[] args) {
        Scanner kure = new Scanner(System.in);

        System.out.println("enter a radius ");
        int rad=kure.nextInt();

        double pi=3.14;
        
        System.out.println("area = "+4*pi*rad*rad);
        System.out.println("volme = "+4/3*pi*rad*rad*rad);

    }
}

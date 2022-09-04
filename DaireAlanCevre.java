import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a radius ");
        int rad=scanner.nextInt();

        double pi=3.14;

        System.out.println("area = "+pi*rad*rad);
        System.out.println("environment = "+2*pi*rad);
    }
}

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class DereceRadyanGrad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a degree ");
        
        double n = scanner.nextDouble();
        double a = (double)Math.toDegrees(n);
        double b =n*200/180;

        System.out.println(n+" Radyan = " + (+a) + " degree ");
        System.out.println(n+" Radyan = " + (+a) + " grad ");

    }
}

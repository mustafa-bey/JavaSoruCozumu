import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int down=scanner.nextInt();
        int up=scanner.nextInt();
 
        long ans = 1;
 
        while (up != 0)
        {
            ans *= down;
            --up;
        }
 
        System.out.println("answer = "+ans);
    }
}

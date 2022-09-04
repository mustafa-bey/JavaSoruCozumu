import java.util.Scanner;

import javax.sql.rowset.spi.SyncProvider;

public class ModAlma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a up and down");

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int ans=a%b;

        System.out.println(ans);

    }
}

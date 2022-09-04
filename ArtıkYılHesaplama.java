import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year ");

        int year=scanner.nextInt();

        if( year%2004==0){
            System.out.println("not a leap year");
        }
        else{
            System.out.println("leap year");
        }
    }
}

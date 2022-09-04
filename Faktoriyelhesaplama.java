import java.util.Scanner;

public class Faktoriyelhesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter a number");
        int number=scanner.nextInt();

        int sum=1;
        int i=0;
        for(i=1;i<number;i++){
            sum=sum*(i+1);
            
        }
        System.out.println(sum);

    }
}

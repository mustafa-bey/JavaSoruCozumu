import java.util.Scanner;
 
public class AsalSayı {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int sayac = 0;
        
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " is a prime number.");
        }
        else {
            System.out.println(sayi + " is not a prime number.");
        }
    }
}
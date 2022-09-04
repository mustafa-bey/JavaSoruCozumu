import java.util.Scanner;
 
public class Mukemmelssayı {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int num = scanner.nextInt();
        
        for(int i=1;i<num; i++)
        {
            if(num % i == 0) {
                toplam += i;
            }
        }
        if(num==toplam) {
            System.out.println(num + " It's a perfect number ");
        }
        else {
            System.out.println(num + " It's not a perfect number");
        }
    }
}
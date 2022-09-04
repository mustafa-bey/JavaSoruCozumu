import java.util.Scanner; // Klavyeden bilgi alalım.
public class SmithSayı {
        private static Scanner klavye; 
        public static void main(String[] args) {
                klavye = new Scanner(System.in);
                System.out.println("Smith sayısı olup olmadığını kontrol etmek istediğiniz sayı nedir? Yazıp Enter'layınız."); 
            int sayi = klavye.nextInt(); 
        if (Smith(sayi)) 
        System.out.println(sayi +" sayısı bir Smith sayısıdır.");
        else
                System.out.println(sayi + " sayısı bir Smith sayısı değildir.");
        }
        public static boolean Smith(int sayi) {
        int gecici = sayi, i; 
        int asal_carpanlar = 0;  
        for (i = 2; gecici > 1; i++) { 
        if (gecici % i == 0) { 
        gecici /= i; 
        asal_carpanlar += i; 
        i--; 
        }
        }
        return basamak_toplami(asal_carpanlar) == basamak_toplami(sayi); 
        }
        public static int basamak_toplami(int sayi){ 
        int toplam = 0;
        while (sayi > 0) { 
        toplam += sayi % 10; 
        sayi /= 10; 
        }
        return toplam;
        }
        }

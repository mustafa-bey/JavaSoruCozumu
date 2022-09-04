import java.util.Scanner;
import java.util.Random;

public class SayıTahmin {
public static void main (String args []) {
Scanner input = new Scanner(System.in);
Random rnd = new Random();

System.out.println("Sayı tahmin oyununa hoş geldiniz!");
System.out.println("Lütfen 1-100 arasında bir sayı giriniz: ");


int guess = input.nextInt();


int sayi = rnd.nextInt(101);
while (guess != sayi) {
if(guess < 0 || guess > 100 ) {

    System.out.println("1Enter a value between 100 and 100:");
    guess = input.nextInt(); }
else if (guess < sayi) {
    System.out.println("Enter a larger number: ");
    guess = input.nextInt(); }
else{
    System.out.println("Enter a smaller number: ");
    guess = input.nextInt();}
}

System.out.println("you are win"); }
}
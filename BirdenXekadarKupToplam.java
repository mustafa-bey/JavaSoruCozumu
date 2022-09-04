import java.util.Scanner;

public class BirdenXekadarKupToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a x value ");
        int x =scanner.nextInt();

        int i=0;
        int sum=0;
        for(i=1;i<x+1;i++){
            sum=sum+i*i*i;
        }
        System.out.println("answer = "+sum);
    }
}

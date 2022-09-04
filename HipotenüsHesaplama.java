import java.util.Scanner;

public class HipotenüsHesaplama {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);

        System.out.println("enter a edge");
        int edge1=ans.nextInt();

        System.out.println("enter a edge");
        int edge2=ans.nextInt();

        int answer=edge1*edge1+edge2*edge2;
        System.out.println("answer = "+Math.sqrt(answer));

    }
}

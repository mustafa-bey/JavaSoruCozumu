import java.util.Scanner;
import java.util.*;

public class kareToplam {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number ");
        int number1=scanner.nextInt();

        System.out.println("enter a number");
        int number2=scanner.nextInt();

        int answer=number1*number1+number2*number2;
        System.out.println("answer = "+ answer);

    }

}

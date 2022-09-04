import java.util.Scanner;

public class UcgenCesitBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("the values of the triangle = 0-180 degree");
        System.out.println("Enter a b and c value ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if (a==b && b==c)
        System.out.println("triangle is equilateral triangle");
        else if (a==b || a==c || b==c)
        System.out.println("triangle is isosceles triangle");
        else
        System.out.println("triangle is scalene triangle");

    }
}

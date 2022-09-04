import java.util.Scanner;

public class KareKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a A edge ");
        int edge1=scanner.nextInt();

        System.out.println("enter a B egde ");
        int edge2=scanner.nextInt();

        System.out.println("enter a C edge ");
        int edge3=scanner.nextInt();

        System.out.println("enter a D egde ");
        int edge4=scanner.nextInt();

       if(edge1==edge2){
            if(edge3==edge4){
                System.out.println("this is a square");
            }
       }
       else{

             System.out.println("this is not a square");

       }
    }
}

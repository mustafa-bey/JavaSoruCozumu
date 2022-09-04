import java.util.Scanner;

public class YasHesaplama {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        
        System.out.println("what we year in ");
        int year=info.nextInt();

        System.out.println("what did you born");
        int born=info.nextInt();

        int answer=year-born;
        System.out.println("you are "+answer+" old");
    }
}

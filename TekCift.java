import java.util.Scanner;
 
class TekCift {
    public static void main(String args[]) {
 
        int i, s = 0;
        int dizi[] = new int[10];
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a number 10 pcs ");
 
        for (i = 0; i < dizi.length; i++) {
            dizi[i] = sc.nextInt();
        }
 
        
        for (int num:dizi) {
           
            if(num%2==0){
                System.out.println("double number = "+num);
            }
            else{
                System.out.println("single number = "+num);
            }
        }
    }
}
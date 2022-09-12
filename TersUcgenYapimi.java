import java.util.Scanner;
public class TersUcgenYapimi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 0;
        System.out.println("Basamak sayısını giriniz: ");

        int sayi = input.nextInt();

        for (int i=sayi;i>0;i--){
            for (int j=sayi-i;j>0;j--){
                System.out.print(" ");
            }

            for (int k=2*i-1;k>0;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}




import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        double result=0;


        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();



        for (double i = 1; i <= sayi; i++){
            result +=(1/i);
        }

        System.out.println(result);
    }
}
import java.util.Scanner;

public class UsluSayıHesaplayanProgram {
    public static void main(String[] args) {
        int n, k;
        int total = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        n = scan.nextInt();
        System.out.println("Üs olacak sayı: ");
        k = scan.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
            System.out.println("Cevap: " + total);
        }
    }


}



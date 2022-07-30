import java.util.Scanner;
public class vücutKitleIndeksi {
    public static void main(String[] args) {
        double boy,kitleIndeksiniz;
        int kilo;

        Scanner input=new Scanner(System.in);


        System.out.println("Boyunuz metre cinsinden:");
        boy=input.nextFloat();

        System.out.println("Kilonuz kg cinsinden:");
        kilo=input.nextInt();

        kitleIndeksiniz=kilo/(boy*boy);
        System.out.println("Kitle İndeksiniz:"+kitleIndeksiniz);
    }
}

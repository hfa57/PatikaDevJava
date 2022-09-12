import java.util.Scanner;
public class AsalSayıBulma {
    public static void main(String[]args){

        int sayi=0;

        for (int i=2;i<=100;i++){
            for (int k=2;k<i;k++){
                if (i%k==0){
                    sayi++;

                }
            }
            if (sayi==0){
                System.out.println(i);

            }
            sayi=0;
        }

    }
}

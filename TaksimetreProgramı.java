package giris2;
import java.util.Scanner;
public class TaksimetreProgramı {
    public static void main(String[] args) {
       int km;
       double perkm=2.20,total,startPrice=10;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen gidilen yolu giriniz: ");
        km=input.nextInt();

        total=km*perkm;
        total+=startPrice;
        total=(total<20) ? 20: total;
        System.out.println("Toplam Tutar: "+total);






 /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

    }
}

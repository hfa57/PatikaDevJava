import java.util.Scanner;
public class KdvTutarıHesaplama {
    public static void main(String[] args) {

            double tutar,kdvOranı=0.018;
            Scanner input= new Scanner(System.in);
            System.out.println("Tutarı Giriniz: ");
            tutar=input.nextDouble();

            double kdvtutar=tutar*kdvOranı;
            double kdvlitutar=tutar+kdvtutar;

        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;



            System.out.println("Kdvli tutar: "+tutar);
            System.out.println("KDV Oranı: "+kdvOranı);
            System.out.println("KDV Tutarı: "+kdvtutar);
            System.out.println("KDV'li Tutarı:"+kdvlitutar);


    }
}

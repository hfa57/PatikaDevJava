import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
       //verileri tanımladım.
        double elmakg=3.67,armutkg=2.14,patlicankg=5.00,domateskg=1.11,muzkg=0.95;
        double elma,patlican,armut,domates,muz,toplamTutar;
    //Scanner sınıfını ekliyorum
        Scanner input=new Scanner(System.in);

        System.out.println("Kaç kilo Patlıcan?:");
        patlican=input.nextDouble();

        System.out.println("Armut Kaç kilo?");
        armut=input.nextDouble();

        System.out.println("Domates Kaç kilo?:");
        domates=input.nextDouble();

        System.out.println("Elma Kaç kilo?:");
        elma=input.nextDouble();

        System.out.println("Muz Kaç kilo ?:");
        muz=input.nextDouble();


        toplamTutar=elma*elmakg+armut*armutkg+muz*muzkg+patlican*patlicankg+domates*domateskg;
        System.out.println("Toplam Tutar:"+toplamTutar);


    }
}

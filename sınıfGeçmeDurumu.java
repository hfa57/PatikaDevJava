import java.util.Scanner;

public class sınıfGeçmeDurumu {
    public static void main(String[] args) {
        int matematik, kimya, fizik, turkce, muzik;
        double ortalama;


        Scanner veri = new Scanner(System.in);

        System.out.println("Kimya notunuz:");
        kimya = veri.nextInt();


        System.out.println("Matematik notunuz:");
        matematik = veri.nextInt();

        System.out.println("Fizik notunuz:");
        fizik = veri.nextInt();

        System.out.println("Türkçe notunuz:");
        turkce = veri.nextInt();

        System.out.println("Müzik notunuz:");
        muzik = veri.nextInt();

        if ((matematik >= 0 && matematik <= 100) && (fizik >= 0 && fizik <= 100) && (turkce >= 0 && turkce <= 100) &&
                (kimya >= 0 && kimya <= 100) && (muzik >= 0 && muzik <= 100)) {

            ortalama = (matematik + muzik + fizik + kimya + turkce) / 5;


            if (ortalama >= 55) {
                System.out.println("Dersten geçtiniz,tebrikler");
            } else {
                System.out.println("Dersten kaldınız");
            }
            System.out.println("Ortalamanız:" + ortalama);
        }
    }
}

import java.util.Scanner;


public class notOrtalaması {
    public static void main(String[] args) {

        //değişkenleri oluştur
        int mat, fizik, kimya, turkce, muzik;
        //scanner sınıfı oluştur.
        Scanner inp = new Scanner(System.in);
        //kullanıcıdan değer al.

        System.out.println("Fizik Notunuz:");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya = inp.nextInt();

        System.out.println("Muzik Notunuz:");
        muzik = inp.nextInt();

        System.out.println("Türkçe Notunuz:");
        turkce = inp.nextInt();

        System.out.println("Matematik Notunuz:");
        mat = inp.nextInt();

        int toplam = (mat + kimya + fizik + muzik + turkce);
        double ortalama = toplam / 5.0;
        System.out.println("Ortalamanız:" + ortalama);

        //ortalama 60 ve 60'tan büyükse sınıftan geçebilir.
        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }
}
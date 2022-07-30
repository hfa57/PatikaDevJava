import java.util.Scanner;

public class havaSıcaklığı {
    public static void main(String[] args) {
        int temporary;
        Scanner veri=new Scanner(System.in);
        System.out.println("Hava Sıcaklığına Bağlı Aktivite Programına Hoş Geldiniz");
        System.out.println("-----------------------------------------------");

        System.out.println("Sıcaklık Giriniz:");
        temporary=veri.nextInt();

        if (temporary<5){
            System.out.println("Kayak yapabilirsiniz.");

        }else if (temporary<15 && temporary>=5){
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temporary>=15 && temporary<25) {
            System.out.println("Pikniğe gidebilirsiniz.");
            
            
        } else if (temporary>=25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
            
        }


    }
}

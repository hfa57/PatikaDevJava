import java.util.Scanner;
public class kullanıcıGirişi {
    public static void main(String[] args) {
        //verileri tanımlıyorum.
        String password, userName, yeniParola;
        int secim = 0;

        //Kullanıcıdan veri alabilmek için scanner sınıfını tanımlıyorum.

        Scanner veri = new Scanner(System.in);

        System.out.println("Username:");
        userName = veri.nextLine();

        System.out.println("Password:");
        password = veri.nextLine();


        //equals() ile parantez içindeki verinin doğru olup olmadığını kontrol ediyoruz.
        if (userName.equals("afh06") && password.equals("grammer123")) {
            System.out.println("Giriş Yaptınız...");
        } else {
            System.out.println("Kullanıcı adı veya parolanız yanlış.");
            //Parolayı sıfırlamak isteyip istemediğini soralım.
            System.out.println("Parolanızı sıfırlamak ister misiniz?");
            System.out.println("Sıfırlamak istiyorsan==1\n Sıfırlamak istemiyorsanız==2");
            secim = veri.nextInt();
        }
        switch (secim) {
            case 1:
                System.out.println("Yeni bir parola giriniz:");
                yeniParola = veri.nextLine();
                if (yeniParola.equals("grammer123")) {
                    System.out.println("Yeni parolanız ile eski paralonız aynı lütfen değiştirin!!!!");
                } else {

                    System.out.println("Tebrikler parolanız sıfırlandı.");
                    yeniParola=veri.nextLine();
                    System.out.println("Yeni Parolanız:" + yeniParola);
                    break;
                }
            case 2:
                System.out.println("Parolanızı sıfırlamak istediniz");
                break;

            default:
                System.out.println("Lütfen 1 veya 2 değerlerinden birini giriniz:");
        }
    }
}

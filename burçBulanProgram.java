import java.util.Scanner;
public class burçBulanProgram {
    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    int month,day;

        System.out.println("Doğdunuz ay:");
        month=scan.nextInt();
        System.out.println("Doğdunuz gün:");
        day= scan.nextInt();

        System.out.println("----------------------------------------");
        /** Ödev: switch-case kullanmadan burç bulan program yazınız.
         * Koç Burcu    : 21 Mart - 20 Nisan
         * Boğa Burcu   : 21 Nisan - 21 Mayıs
         * İkizler Burcu: 22 Mayıs - 22 Haziran
         * Yengeç Burcu : 23 Haziran - 22 Temmuz
         * Aslan Burcu  : 23 Temmuz - 22 Ağustos
         * Başak Burcu  : 23 Ağustos - 22 Eylül
         * Terazi Burcu : 23 Eylül - 22 Ekim
         * Akrep Burcu  : 23 Ekim - 21 Kasım
         * Yay Burcu    : 22 Kasım - 21 Aralık
         * Oğlak Burcu  : 22 Aralık - 21 Ocak
         * Kova Burcu   : 22 Ocak - 19 Şubat
         * Balık Burcu  : 20 Şubat - 20 Mart
         */
        if(month>0 && month<13 && day>0 && day<32){
            if (month==1){
                if (day<22){
                    System.out.println("OĞLAK");
                }else{
                    System.out.println("KOVA");
                }
            }
            if (month==2){
                if (day < 20) {
                    System.out.println("KOVA");
                }else{
                    System.out.println("BALIK");
                }
            }if (month==3){
                if (day<21){
                    System.out.println("BALIK");
                }else{
                    System.out.println("KOÇ");
                }
            }if(month==4){
                if (day<21){
                    System.out.println("KOÇ");
                }else{
                    System.out.println("BOĞA");
                }
            }
            if (month==5){
                if (day<22){
                    System.out.println("BOĞA");
                }else{
                    System.out.println("İKİZLER");
                }
            }
            if (month==6){
                if (day<23){
                    System.out.println("İKİZLER");
                }else {
                    System.out.println("YENGEÇ");
                }
            }
            if (month==7){
                if (day<23){
                    System.out.println("YENGEÇ");
                }else{
                    System.out.println("ASLAN");
                }
            }
            if (month==8){
                if (day<23){
                    System.out.println("ASLAN");
                }else{
                    System.out.println("BAŞAK");
                }
        }
            if (month == 9) {
                if (day<23){
                    System.out.println("BAŞAK");
                }else{
                    System.out.println("TERAZİ");
                }
            }
            if (month==10){
                if (day<23){
                    System.out.println("TERAZİ");
                }else{
                    System.out.println("AKREP");
                }
            }
            if (month==11){
                if (day<22){
                    System.out.println("AKREP");
                }else{
                    System.out.println("YAY");
                }
            }
            if (month==12){
                if (day<22){
                    System.out.println("YAY");
                }else{
                    System.out.println("OĞLAK");
                }
            }
            }
            else{
            System.out.println("YANLIŞ BİLGİ");
        }



    }
}

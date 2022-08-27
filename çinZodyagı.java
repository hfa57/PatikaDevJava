import java.util.Scanner;
public class çinZodyagı {
    public static void main(String[] args){
        int bornYear,kalan;
        String burc="";
        Scanner inp=new Scanner(System.in);

        System.out.println("Hangi yılda doğdunuz?");
        bornYear=inp.nextInt();

        kalan=bornYear%12;

        switch (kalan){
            case 0:
            burc="MAYMUN";
            break;
            case 1:
                burc="HOROZ";
                break;
            case 2:
                burc="KÖPEK";
                break;
            case 3:
                burc="DOMUZ";
                break;
            case 4:
                burc="FARE";
                break;
            case 5:
                burc="OKÜZ";
                break;
            case 6:
                burc="KAPLAN";
                break;
            case 7:
                burc="TAVŞAN";
                break;
            case 8:
                burc="EJDERHA";
                break;
            case 9:
                burc="YILAN";
                break;
            case 10:
                burc="AT";
                break;
            case 11:
                burc="KOYUN";
                break;
        }

        System.out.println("ÇİN ZODYAĞI BURCUNUZ:"+burc);





    }
}

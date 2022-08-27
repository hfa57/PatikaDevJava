import java.util.Scanner;
public class aArtıkYılHesaplama {
    public static void main(String[] args){
        int year;

        Scanner input=new Scanner(System.in);

        System.out.println("YIL:");
        year=input.nextInt();

        if (year % 100 ==0){
            if (year % 400 ==0){
                System.out.println(year+"artık yıldır");
            }
        }else {
            if (year % 4 ==0){
                System.out.println(year + " bir artık yıldır!");
            }else {
                System.out.println(year+" artık yıl değildir !!");
            }
        }







    }
}

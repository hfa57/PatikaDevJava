import java.util.Scanner;
public class minMaxDegerler {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        int max=0,min=0;
        System.out.println("Kaç tane sayı gireceksiniz?: ");
        int n=input.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println(i+"\nSayıyı giriniz: ");

            int number= input.nextInt();

            if (i==1){
                max=number;
                min=number;

            }if (number>max){
                max=number;
            }if (min>number){
                min=number;
            }
            System.out.println("En büyük sayı: "+max);
            System.out.println("En küçük sayı: "+min);


        }


    }
}

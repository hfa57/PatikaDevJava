import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        int s, total =0 ;

        System.out.print("Mukemmel sayi sorgulamasi yapacaginiz sayi : ");
        s= input.nextInt();

        for(int i=s-1 ; i>=1 ; i--){

            if(s%i==0){
                total +=i;
            }

        }

        if(total ==s){

            System.out.println("Sayinizi mukemmel sayidir.");
        }else{
            System.out.println("Sayi mukemmel degildir.");
        }
    }
}

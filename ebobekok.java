import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        int number1,number2,smallnumber;

        Scanner input=new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        number1=input.nextInt();

        System.out.println("İkinci Sayıyı giriniz: ");
        number2=input.nextInt();

        if (number1>=1 && number2>=1){
            int i=1,ebob=1;
            while (i<=number1){
                i++;
                if (number1 % i ==0 && number2 == 0){
                    ebob=i;

                }
            }
            System.out.println(number1+ "ve" +number2+ "değerleri için EBOB: " +ebob);

            int ekok;
            ekok=(number1*number2)/ebob;
            System.out.println(number1+ "ve" +number2+ "değerleri için EKOK: " +ekok);

        }else{
            System.out.println("Negatif bir değer girildiği için program iptal edilmiştir.");
        }


            }

        }




import java.util.Scanner;
public class hesapMakinesiProgrami {
    public static void main(String[] args) {
        int a,b,select;
        Scanner input=new Scanner(System.in);


        System.out.println("Lütfen bir sayı giriniz:");
        a=input.nextInt();

        System.out.println("Lütfen bir sayı giriniz:");
        b=input.nextInt();


        System.out.println("1.İşlem=Toplama\n2.İşlem=Çıkarma\n3.İşlem=Çarpma\n4.İşlem=Bölme\n");
        System.out.println("Lütfen bir işlem seçiniz:");
        select=input.nextInt();



        switch (select){
            case 1:
                System.out.println("Toplama:"+ (a+b));
                break;

            case 2:
                System.out.println("Çıkarma:"+ (a-b));
                break;
            case 3:
                System.out.println("Çarpma"+ (a*b));
                break;

            case 4:
                if (a!=0){
                    System.out.println("Bölme:"+(a/b));


                }else {
                    System.out.println("Bir sayı sıfıra bölünemez.");

                }
                break;
            default:
                System.out.println("Lütfen 1-2-3-4 değerlerinden birini seçiniz:");


        }


        }


    }


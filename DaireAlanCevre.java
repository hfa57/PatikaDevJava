import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {

        double r,cevre,alan,π;
        int area;
        int a;
         π=3.14;
        double daireDilimiAlanı;

        Scanner input=new Scanner(System.in);

        System.out.println("Yarıçap değeri:");
        r=input.nextDouble();

        alan=π * r * r;
        cevre=2 * π * r;

        System.out.println("Çevre:"+cevre);
        System.out.println("Alan:"+alan);


        System.out.println("Açının değeri:");
        a=input.nextInt();

        System.out.println("Girilen Dairenin Alanı");


        //DAİRE DİLİMİ ALANI
        daireDilimiAlanı=(π*(r*r)*a)/360;

        System.out.println("Daire Dilimi Alanı:"+daireDilimiAlanı);
        daireDilimiAlanı=input.nextDouble();


    }
}

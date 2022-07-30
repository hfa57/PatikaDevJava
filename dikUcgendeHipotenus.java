import java.util.Scanner;

public class dikUcgendeHipotenus {
    public static void main(String[] args) {
        //veri tanımalama
    int a,b;
    double c;
    double area;
    int u;


    //veri isteme
        Scanner inp=new Scanner(System.in);

        System.out.println("1.kenarı giriniz:");
        a=inp.nextInt();
        System.out.println("2.kenarı giriniz:");
        b=inp.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs:"+c);

        //ucgenin alanını bulma
        System.out.println("Üçgenin Alanı:");
        area=inp.nextInt();

        System.out.println("Üçgenin çevresi:");
        u=inp.nextInt();

       area= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:"+area);




    }
}

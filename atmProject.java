import java.util.Scanner;

public class atmProject {
    public static void main(String[]args){

       Scanner input=new Scanner(System.in);
       int balance=1000,toplam=0,right=0;

        System.out.println("Username: ");
        String username=input.nextLine();

        System.out.println("Password: ");
        String password=input.nextLine();

        if (username.equals("patika123")&&password.equals("123")){
            System.out.println("Welcom the BANK OF SOFTWARE: ");
            System.out.println("1-Deposit Money\n"+"2-Withdraw Money\n"+"3-Balance Inquiry\n"+"4-Exit\n");

            int a=input.nextInt();
            switch (a){
                case 1:
                    System.out.println("Amount of money: ");
                    int b=input.nextInt();
                    balance+=b;
                    System.out.println("3-Balance Inquiry: "+balance);
                    break;
                case 2:
                    System.out.println("Withdraw Amount Of Money: ");
                    int h=input.nextInt();
                    if (h>balance){
                        System.out.println("insufficient balance");
                        break;
                    }else{
                        balance-=h;
                        System.out.println("3-Balance Inquiry"+balance);
                        break;

                    }
                case 3:
                    System.out.println("3-Balance Inquiry: "+balance);
                    break;
                case 4:
                    System.out.println("See you later");
                    break;
            }
        }
        else{
            right--;
            System.out.println("Wrong username or password.");
            if (right==0){
                System.out.println("Your account is blocked.");
            }
        }




    }
}

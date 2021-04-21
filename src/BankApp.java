import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Operations");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Exit");
        System.out.println("Choose Operation : ");
        int op = sc.nextInt();

        while(true) {
            if(op == 1) {

                System.out.println("Please enter your balance");
                int balance = sc.nextInt();

                System.out.println("How much to deposit : ");
                int dep_amount = sc.nextInt();

                System.out.println("Your new balance is : "+ (balance+dep_amount));
                break;

            } else if(op == 2) {

                System.out.println("Please enter your balance");
                int balance = sc.nextInt();

                System.out.println("How much to be withdrawn : ");
                int wd_amount = sc.nextInt();

                if (balance < wd_amount) {
                    System.out.println("You cannot withdraw more than your balance!");
                } else {
                    System.out.println("Your new balance is : "+ (balance - wd_amount));
                }

                break;

            } else if(op == 3) {

                System.out.println("Exiting from system....");
                break;

            }
        }
    }
}

import java.util.Scanner;

public class AgeControl {
    public static void main(String[] args) {
        // and - &&
        // or - ||
        // not - !

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Age Control Application!");
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age > 18 && age < 50) {
            System.out.println("Adult");
        } else if(age>=13 && age<=18) {
            System.out.println("Teenager");
        } else if(age>50) {
            System.out.println("Aged");
        } else if(age > 0 && age < 13) {
            System.out.println("Kid");
        } else {
            System.out.println("Please enter a positive number");
        }
    }
}

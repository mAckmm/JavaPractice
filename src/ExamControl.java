import java.util.Scanner;

public class ExamControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Exam Control Application");
        System.out.println("Enter 1st exam result");
        int first_result = sc.nextInt();
        System.out.println("Enter 2st exam result");
        int second_result = sc.nextInt();

        if(first_result > 50 && second_result > 50) {
            System.out.println("You got A grade college degree");
        } else if(first_result > 50 || second_result > 50) {
            System.out.println("You got B grade college degree");
        } else {
            System.out.println("You cannot have college degree");
        }

    }
}

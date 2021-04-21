import java.util.Scanner;

public class DemoExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your exam result : ");
        int result = sc.nextInt();
        switch(result) {
            case 90:
                System.out.println("You got A");
                break;
            case 80:
                System.out.println("You got B");
                break;
            case 70:
                System.out.println("You got C");
                break;
        }
    }
}

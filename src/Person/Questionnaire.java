package Person;

import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("What is your name : ");
        p1.name = sc.next();
        System.out.println("Please enter your age : ");
        p1.age = sc.nextInt();

        System.out.println(p1.name+" is "+p1.age+" years old."+p1.name+" is a(an) "+p1.ageCategory(p1.age));

        Person p2 = new Person();
        System.out.println("What is your name : ");
        p2.name = sc.next();
        System.out.println("Please enter your age : ");
        p2.age = sc.nextInt();

        System.out.println(p2.name+" is "+p2.age+" years old."+p2.name+" is a(an) "+p2.ageCategory(p2.age));

    }
}

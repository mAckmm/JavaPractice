public class MultiplicationTable {
    public static void main(String[] args) {
        int c = 1, d;
        System.out.println("This is Multiplication table!");
        for(int a = 1; a<=10; a++) {
            System.out.println("---------------");
            for(int b = 1; b<=10; b++) {
                System.out.println(a+" X "+b+" = "+a*b);
            }
        }

        System.out.println("\n\nThis is Multiplication table using while loop!");
        while(c < 4) {
            System.out.println("---------------");
            d = 1;
            while(d <= 10) {
                System.out.println(c+" X "+d+" = "+c*d);
                d++;
            }
            c++;
        }

        c = 1;

        System.out.println("\n\nThis is Multiplication table using do while loop!");
        do {
            System.out.println("---------------");
            d = 1;
            do {
                System.out.println(c+" X "+d+" = "+c*d);
                d++;
            } while(d <= 10);

            c++;

        } while(c < 4);

    }
}

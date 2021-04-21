public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("This is Multiplication table!");
        for(int a = 1; a<=10; a++) {
            System.out.println("---------------");
            for(int b = 1; b<=10; b++) {
                System.out.println(a+" X "+b+" = "+a*b);
            }
        }
    }
}

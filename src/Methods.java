public class Methods {

    static void name(String fname, int age) {
        System.out.println(fname+" is "+age+" years old");
    }

    // Method Overloading
    static int add(int a, int b) {
        return a+b;
    }
    static double add(double a, double b) {
        return a+b;
    }

    // Recursion
    static int series_add(int n) {
        if(n>0) {
            return n + series_add(n-1);
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        name("John", 18);
        System.out.println("Addition of 2 and 3 is : "+add(2,3));
        System.out.println("Addition of 2.222 and 3.333 is : "+add(2.222,3.333));
        System.out.println("Sum of first 10 natural numbers : "+series_add(10));
    }
}

/* NOTES */
/* A method/function ->
It is a block of code which runs only when it is called.
We can pass data/parameters into a method.
It is used to perform certain actions.
Used for code reuse.
 */



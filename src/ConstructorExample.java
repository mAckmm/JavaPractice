public class ConstructorExample {
    // Class ConstructorExample attributes
    int v1;
    int v2;

    // Custom Constructor of this class which initializes the attributes using passed parameters.
    // Constructor name should match with class name
    public ConstructorExample(int a, int b) {
        v1 = a;
        v2 = b;
    }

    public static void main(String[] args) {
        ConstructorExample c1 = new ConstructorExample(1,2);
        System.out.println("Initialized values using constructor are : "+c1.v1+" and "+c1.v2);
    }
}

public class Variables {
    public static void main(String[] args) {
        // Variables hold data in one of the data types
        // data_type variable_name = value_of_variable
        byte little = 127;
        short small = 32677;
        int normal = 2147483647;
        long big = 7235723985710235732L;
        float waves = 5.5f;
        double xl = 2.2222222222d;
        char utf_16 = 'A';
        boolean is_tiny = true;

        // Widening casting
        big = normal;
        // Narrowing casting
        normal = (int) xl;

        String is_an_object = "Hello";

        System.out.println("byte : "+little+"\n short : "+small+"\n int : "+normal+"\n long : "+big+"\n float : "+waves+"\n double : "+xl+"\n char : "+utf_16+"\n boolean : "+is_tiny+"\n String : "+is_an_object);

    }
}

/* NOTES */
/* Data Types :
    __primitive__
    byte - 1 byte ( -128 to 127 )
    short - 2 bytes ( -32768 to 32767 )
    int - 4 bytes ( -2147483648 to 2147483647 )
    long - 8 bytes ( -2^(64-1) to 2^(64-1)-1 )
    float - 4 bytes ( 6 to 7 decimal digits - 3.4e-038 to 3.4e+038 )
    Note : value should end with 'f' e.g. 5.5f
    double - 8 bytes ( 15 decimal digits - 1.7e-308 to 1.7e+308 )
    Note : value should end with 'd' e.g. 5.5555555d
    char - 2 byte ( single character/letter as ASCII values )
    boolean - 1 bit ( true as 1 and false as 0 )

    __non-primitive__
    String - This is non-primitive in java because it is an object which has it's own methods.

    Type Casting :
    Widening Casting (automatic) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte

*/
package Person;

public class Person {
    public String name = "";
    public int age = 0;

    public String ageCategory(int age) {
        if(age > 0 && age < 13) {
            return "Kid";
        } else if(age>=13 && age<=19) {
            return "Teenager";
        } else if(age > 19 && age < 50) {
            return "Adult";
        } else if(age>50) {
            return "Aged";
        }  else {
            return "";
        }

    }
}

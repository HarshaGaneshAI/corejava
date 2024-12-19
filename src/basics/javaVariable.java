package basics;

public class javaVariable {
    String StudentFirstName = "ABC"; // non-static javaVariable

    static int id = 45; //static varaible

    public static void main(String[] args){
        javaVariable Student = new javaVariable();
        System.out.println(Student.id);
        System.out.println(Student.StudentFirstName);
        oldstudent();

    }
    public static void oldstudent(){
        int id = 18;
        System.out.println(id);
    }

}
/**
 * Varaibles : It is the basic unit of storage in a program and are used to store data such as numbers,strings,objects and arrays.
 * Global javaVariable
 * i) Instant variables (Non-Static Fields) : declared within the class and are accessbile to all methods and constructors within that class.
 * ii)Class variables (Static fields) : decleared within the class and are accessible to all the methods and constructors within that class and other classes that use the class.
 *
 * Local javaVariable : decleared within a method and are accessible only within that method.
 * Parameters
 *

 **/
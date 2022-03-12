import java.util.*;
public class methods_in_java {
    static void my_method()
    {
        Scanner sc = new Scanner(System.in);
        // For taking input from user
        System.out.println("Enter your First name");
        String name=sc.nextLine();
        System.out.println("Enter your last name");
        String namel=sc.nextLine();
        String f_name = name +" "+ namel;
        System.out.println(f_name);     
    //    calling out that method and stroring it in a variable p 
        String p=methods_in_java.method2(f_name);
        System.out.println("your selection is done");
    }
    // this is a method inside main where we retun some string value therefore we changed void to String
    static String method2(String full_name)
    {
        String f = full_name+" "+ "20112010";
        System.out.println("your name and roll_no is-"+f);
        return f;
    }

    
// this is the main function 
public static void main(String[] args)
{
    methods_in_java.my_method();
}
}
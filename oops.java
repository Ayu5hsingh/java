import java.util.*;
public class oops
{    
    int x=5;
    public static void main(String[] args)
    {
        // Syntax for creating a obj of a class
        oops obj =new oops();
        // How we can refer to a class variable using obj
        System.out.println(obj.x);
        System.out.println(obj.x);  
        students gg = new students();
        gg.read();
        gg.display();
        System.out.println("Done!!");
    }   
        
}   


class students
{
    String name;
    int roll;
    String email;
    students()
    {
        System.out.println("Constructor initialized");

    }
    public void display()
    {

        System.out.println(name);
        System.out.println(roll);
        System.out.println(email);
    }
    public void read()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        name= input.nextLine();
        System.out.println("Email");	
        email=input.nextLine();
        roll=input.nextInt();



    }

}
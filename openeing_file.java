// import java.io.File;0
import java.io.FileWriter;
import java.io.IOException;

public class openeing_file {
    public static void main(String args[])
    {
        try{
            FileWriter obj = new FileWriter("texting.txt");
            obj.write("My name is ayush");
            obj.close();
        }
        catch(IOException e){
            System.out.println("sorry");
            e.printStackTrace();
        }        
    }

}

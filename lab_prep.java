import  java.io.File;
import java.io.IOException;
import java.util.*;
public class lab_prep {
    public static String abc[];
    public static void main(String args[])
    {
        // String abc[];
        int c=0;
        try
        {
            File obj =new File("Book1.csv");
            Scanner reader_f = new Scanner(obj);
            while (reader_f.hasNextLine())
            {
                String a=reader_f.nextLine();
                abc=a.strip().split(",");
                c++;
            }
            for (int i=0;i<c;i++)
            {
                String v=abc[i];
                System.out.println(v);
            }
            
    

        }catch(IOException e){
            System.out.println("File not foud ");
            e.printStackTrace();
        }
      

    }
    
}

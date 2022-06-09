import java.io.File;
import java.io.IOException;

public class filehandle1 {
    public static void main(String args[])
    {
        try{
            File obj = new File("testing.txt");
            if(obj.createNewFile())
            {
                System.out.println("File Created"+obj.getName());

            }
            else
            {
                System.out.println("File already exists");

            }
        } catch (IOException e){
            System.out.println("An errror encoured ");
            e.printStackTrace();
            
        }
    }

}

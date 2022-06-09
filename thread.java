// import java.io.IOException;`

class multithread extends Thread 
{
    public void run()
    {
        try
        {
            // prints the id
            System.out.println(Thread.currentThread().getId());
        }catch(Exception e){
            System.out.println(e.getMessage());
        } 


    }
    
}

public class thread
{
    public static void main(String []args)
    {
        for(int i=1; i<10;i++)
        {
            multithread obj = new multithread();
            obj.start();
        }
        

    }

}
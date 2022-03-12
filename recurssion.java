public class recurssion 
{
    public static void main(String[] args)
    {
        // calling for sum method and also receiving the sum value 
        int results =sum(10);
        int result1=fac(10);
        System.out.println("the sum of numbers from 1 to 10 is "+results);
        System.out.println("factorial of first 10 number "+result1);
    }

    public static int sum(int k )
    {
        if (k>0)
        {
            // recurssion is appiped so we are stuck in a loop over here 
            return k+sum(k-1);
             
        }
        else
        {
            return k;
        }
    }
    public static int fac(int p)
    {
        if (p>0)
        {
            return p*fac(p-1);
        }
        else if (p==0)
        {
            return 1;
        }
        else 
        {
            return 1;
        }

    }
   
}

    


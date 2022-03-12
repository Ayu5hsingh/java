import java.util.*;
public class methodoverloading
{
    static int add_method(int x,int y)
{
    int a=x+y;
    return a;
}
static double add_method(double x,double y)
{
    double b=(x+y);
    return b;
}


public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the First number");
    int o=sc.nextInt();
    System.out.println("Enter the second");
    int p=sc.nextInt();
    System.out.println(" Enter the First number");
    Double oo=sc.nextDouble();
    System.out.println("Enter the second");
    Double pp=sc.nextDouble();
    int ans1=methodoverloading.add_method(o,p);
    double ans2=methodoverloading.add_method(oo,pp);
    System.out.println(ans1);
    System.out.println(ans2);
    
}

}


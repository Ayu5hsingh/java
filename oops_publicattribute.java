public class oops_publicattribute {
    
    public void mymethod()
    {
        System.out.println("public method");

    }

    static void mymethod1()
    {
        System.out.println(" static method");
    }

    public static void method2()
    {
        System.out.println("public and static method");
    }

    public static void main(String[] args)
    {
        mymethod1();
        oops_publicattribute obj = new oops_publicattribute();
        obj.mymethod();
        method2();


    }
    
}

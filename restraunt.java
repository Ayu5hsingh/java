import java.util.*;

class menu {
    String item_name;
    int item_price;

    menu() {
    }

    menu(String name, int price) // parameterised constructor to set values
    {
        this.item_name = name;
        this.item_price = price;
    }

    void display() {
        System.out.println("item name is: " + this.item_name);
        System.out.println("item price is: " + this.item_price);
        System.out.println();
    }
}

class customer {
    String name;
    String email;
    int mobile_no_no;

    Scanner sc = new Scanner(System.in);

    menu[] ob = new menu[3];

    customer(String a, String b, int c) {
        name = a;
        email = b;
        mobile_no_no = c;
        int i = 0;
        while (i < 3) {
            System.out.println("enter item name");
            String itemN = sc.nextLine();
            sc.next();
            System.out.println("enter item price");

            int itemP = sc.nextInt();

            ob[i] = new menu(itemN, itemP);
            i += 1;
        }
    }

    void display() {
        System.out.println("customer name is: " + this.name);
        System.out.println("customer email is: " + email);
        System.out.println("his mobile_no number is: " + mobile_no_no);

        int tp = 0;
        for (int i = 0; i < 3; i++) {
            tp = tp + ob[i].item_price;
        }

        System.out.println("items total price is: " + tp);
    }
}

public class restraunt {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        menu[] menuList = new menu[5];
        int menucount = 0;

        customer[] customerList = new customer[5];
        int customercount = 0;

        int choice = 0;

        do {
            System.out.println("1. Create a menu item");
            System.out.println("2. Display menu item");
            System.out.println("3. Create a customer");
            System.out.println("4. Display customers");
            System.out.println("5. Exit the applicatoin");

            choice = sc.nextInt();
            // sc.next();

            switch (choice) {
                case 1: {
                    System.out.println("enter name of item");
                    String name = sc.nextLine();
                    sc.next();
                    System.out.println("enter price of item");
                    int price = sc.nextInt();
                    menu ob1 = new menu(name, price);
                    menuList[menucount] = new menu(name, price);
                    menucount += 1;
                    System.out.println("menu item created!");
                    System.out.println(" item name is: " + menuList[0].item_name);
                    break;
                }
                case 2: {
                    for (int i = 0; i < menucount; i++) {
                        menuList[i].display();
                    }
                    break;
                }
                case 3: {
                    System.out.println("enter name ");
                    String name = sc.nextLine();
                    sc.next();
                    System.out.println("enter email");
                    String email = sc.nextLine();
                    sc.next();
                    System.out.println("enter mobile_no_no number");
                    int mobile_no_no = sc.nextInt();

                    customer ob1 = new customer(name, email, mobile_no);
                    customerList[customercount] = ob1;
                    customercount += 1;
                    System.out.println("items created!");
                    break;
                }
                case 4: {
                    for (int i = 0; i < customercount; i++) {
                        customerList[i].display();
                    }
                    break;
                }
                default: {
                    System.out.println("Please correct options");
                    break;
                }

            }
        } while (choice != 5);
    }
}
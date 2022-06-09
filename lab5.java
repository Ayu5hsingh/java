
import java.util.*;
class details {

    static boolean vip = true;
    static double rate;

    details(){
        vip = false;
        rate = 1;
    }

    details(int c){
        vip = true;
        switch (c) {
            case 1:
                rate = 1.5; 
                break;
            case 2:
                rate = 2; 
                break;
            case 3:
                rate = 2.5;
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    } 
    
    static void reward(){
        System.out.println("You are not a VIP member. Reward rate = " + rate + " %");
    }

    static void output(String a){
        System.out.println("You are a " + a + " member. Reward rate = " + rate +"%");
    }

    static void reward(int x){
        String a="";
        switch (x) {
            case 1:
                a = "Silver";
                output(a);
                break;
            case 2:
                a = "Gold";
                output(a);
                break;
            case 3:
                a = "Platinum";
                output(a);
                break;
        }
        
    }
}



public class lab5 extends details {

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Are you a VIP member (y/n)?");
        char a = obj.next().charAt(0);
        if(a=='n'){
            reward();

        }
        // else if(a=='y'){
        //     System.out.println("Choose membership type:\n1.Silver\n2.Gold\n3.Platinum");
        //     int z = obj.nextInt();
            // lab5 obj4 = new lab5(z);
            // obj4.reward(z);
        // }
        else{
            System.out.println("Invalid input!");
        }
    }
}
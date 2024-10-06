import java.util.Scanner;
public class Recursion_print_netural_number_uing_input {
    static void logic(int a,int b){
        //Recursion logic :
        if(a==b){
            System.out.println(b);
            return;
        }else{
            System.out.println(a);
            logic(a+1,b);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Recursion print netural number increment order using input :");
        System.out.print("Enter a = ");
        int a= sc.nextInt();
        System.out.print("Enter b :");
        int b=sc.nextInt();
        logic(a,b);


    }
}

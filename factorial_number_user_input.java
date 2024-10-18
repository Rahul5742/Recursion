import java.util.Scanner;
public class factorial_number_user_input {
    static void logic(int a,int n,int sum){
//       Recursion logic of factorial :
        if(a==n){
            sum*=a;
            System.out.print(a+" = "+sum);
        }else{
            System.out.print(a+" + ");
            sum*=a;
            logic(a+1,n,sum);

        }
    }
//      main method :

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Recursion factorial number user input :");

//      input
        System.out.print("Enter value of n  :");
        int n=sc.nextInt();
        int sum1=1,i=1;



//      output :
        logic(i,n,sum1);



//           Another way to print :
//        logic(1,10,1);
    }
}
//            output : 1 + 2 + 3 + 4 + 5 = 120

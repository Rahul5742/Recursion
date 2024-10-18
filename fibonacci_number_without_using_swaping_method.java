
public class fibonacci_number_without_using_swaping_method{
    static int logic(int n) {
        //condition 1:
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;


        }//Recursive call :
        return logic(n - 1) + logic(n - 2);
    }



//main method :
    public static void main(String[] args) {
        System.out.println("fibonacci number without swaping number :");
        int a=7;
        System.out.println("This is your fibonacci number "+a+" = "+logic(a));
    }

}

/* codition 2 :
if(a==1,a==2)
return n-1;}
 */

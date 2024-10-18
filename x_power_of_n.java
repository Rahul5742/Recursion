public class x_power_of_n {
    static int logic(int x,int n) {
//        recursion logic of x power of n :
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }


        return x*logic(x,n-1);

    }


    //        input :
    public static void main(String[] args) {
        System.out.println("Recursion of x power n : ");
        int a=2,b=5;
        int sum1=logic(a,b);


//      output :
        System.out.println("This is your result : "+a+" ^ "+b+" = "+sum1);


    }
}
//.     output :2^5=32
//.     2*2*2*2*2=32



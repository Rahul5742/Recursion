public class factorial_number {
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
        System.out.println("factorial :");

//      input
        int i=1,n=5,sum1=1,product;

//      output :
        logic(i,n,sum1);



//           Another way to print :
//        logic(1,10,1);
    }
}
//            output : 1 + 2 + 3 + 4 + 5 = 120

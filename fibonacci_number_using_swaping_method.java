public class fibonacci_number_using_swaping_method {
    static void logic(int a,int b,int c,int n){

//        recursion logic of fibbonacci number :
        if(n==10){
            System.out.println(c);
            return;
        }System.out.println(c);
        c=a+b;
        a=b;
        b=c;
        c=a;

        logic(a,b,c,n+1);
    }
    //       input :
    public static void main(String[] args) {
        System.out.println("Recursion of fibonacci number :");
        logic(0,1,0,0);
    }
}

//      output : 0
//        0 + 1 = 1
//            1 + 1 = 2
//                1 + 2 = 3
//                    2 + 3 = 5
//                        3 + 5 = 8
//                            5 + 8 = 13
//                                8 + 13 = 21
//                                     13 + 21 = 34

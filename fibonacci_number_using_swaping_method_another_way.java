public class fibonacci_number_using_swaping_method_another_way {
    public static void printFib(int a, int b, int n) {
//    Recursion logic of fibonacci number  :
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }
//        input :
    public static void main(String[] args) {
        System.out.println("Recursion of fibonacci number  :");
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n - 2);
    }
}

//    output : 0,1,1,2,3,5,8,13,21,34
//      0 + 1 = 1
//          1 + 1 = 2
//              1 + 2 = 3
//                  2 + 3 = 5
//                      3 + 5 = 8
//                          5 + 8 = 13
//                              8 + 13 = 21
//                                   13 + 21 = 34
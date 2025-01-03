import java.util.Scanner;

public class pettern_using_recursion {
    //method using recursive .
    static void logic(int n) {
        //logic .
        if (n >=1) {
            logic(n - 1);
            for (int i = 1; i <=n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int a = sc.nextInt();
        logic(a);

    }
}
// output .
//         *
//         *  *
//         *  *  *
//         *  *  *  *
//         *  *  *  *  *
public class pattern_up_to_down {
    static void logic(int n){
        if(n>0){
            logic(n-1);
            for (int i = 0; i <n ; i++) {
                System.out.print(" * ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        logic(5);
    }
}

// *
// *  *
// *  *  *
// *  *  *  *
// *  *  *  *  *

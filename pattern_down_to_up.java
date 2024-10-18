public class pattern_down_to_up {
    static void logic(int n){
        if(n>0){

            for (int i = 0; i <n ; i++) {
                System.out.print(" * ");

            }
            System.out.println();
            logic(n-1);
        }
    }

    public static void main(String[] args) {
        logic(5);
    }
}


// *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *
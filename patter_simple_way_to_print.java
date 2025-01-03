public class patter_simple_way_to_print {
    // logic of pattern....
    static void logic(int n){
        if(n==0){
            return  ;
        }
        logic(n-1);
        System.out.println(" * ".repeat(n));
    }
    // main method.....
    public static void main(String[] args) {
        // call of method....
        int a=5;
        logic(a);
    }
}
//*
//*  *
//*  *  *
//*  *  *  *
//*  *  *  *  *

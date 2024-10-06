public class reverse_netural_number {
    static void logic(int a){

        //Recursion logic :
        if(a==0){
            return;
        }else{
            System.out.println(a);
            logic(a-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Recursion print netural number decrement order :");
        int x=15;
        logic(x);
            //another way to print :
        // logic(15);
    }
}

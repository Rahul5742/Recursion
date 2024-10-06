public class Netural_number {
    static void logic(int a){

        //Recursion logic :
        if(a==15){
            System.out.println("15");
            return;
        }else{
            System.out.println(a);
            logic(a+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Recursion print netural number increment order :");
        int x=1;
        logic(x);
        //another way to print :
     // logic(1);
    }
}

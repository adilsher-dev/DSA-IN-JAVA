public class Fibonnaci {
    public int fib(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        int x= 5;
        Fibonnaci obj = new Fibonnaci();
        System.out.println(obj.fib(x));
    }
}

public class factorial {

    public int fact(int n){
        if( n == 0 || n ==  1){
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }

    public static void main(String[] args) {
        int x = 5;
        factorial obj = new factorial();
        System.out.println(obj.fact(x));
    }
}

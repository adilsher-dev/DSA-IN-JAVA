public class Number1 {

    public int Name(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n + Name(n - 1);
        }
    }
    public static void main(String[] args) {
        int n1 = 5;
        Number1 obj = new Number1();
        System.out.println(obj.Name(n1));
    }
}


public class Number {

    public void Name(int n){
        if(n == 0){
            return;
        }
        else{
            Name(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Number obj = new Number();
        obj.Name(n);
    }
    
}

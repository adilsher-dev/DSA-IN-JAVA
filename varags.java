//Variable Arguments, or Varargs, is a feature in Java that allows a function to accept any number of arguments (including zero). It makes your methods more flexible because you don't have to know exactly how many values the user will pass.

public class varags{
    static int sum(int ...numbers){
        int total = 0;
        for(int n : numbers){
            total += n;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
}

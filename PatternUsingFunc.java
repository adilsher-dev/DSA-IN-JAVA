
public class PatternUsingFunc{
    void pattern(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void main(String[] args){
        PatternUsingFunc obj = new PatternUsingFunc();
        obj.pattern(5);
    }
}

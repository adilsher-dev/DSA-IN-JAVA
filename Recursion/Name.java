public class Name{

    public void Number(int n){
        if (n  == 0){
            return;
        }
        else{
            System.out.println("Adil");
            Number(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Name obj = new Name();
        obj.Number(n);
    }
}
public class Natural {
    public void Number(int n){
        int sum = 0;
        if(n == 0){
            return;
        }
        else {
            sum += n;
            Number(n-1);
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Natural obj = new Natural();
        obj.Number(5);
    }
}

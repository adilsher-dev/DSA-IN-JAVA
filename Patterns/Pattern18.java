public class Pattern18 {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n;i++){
            for(int j = 65 + (n - i) ; j < 70 ;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
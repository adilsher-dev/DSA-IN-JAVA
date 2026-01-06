public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n ; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1 ; k <=  2 * (n - i); k++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int a = 1 ; a <= n; a++){
            for(int b =  1 ; b <= a; b++){
                System.out.print("*");
            }
            for(int c = 1 ; c <=  2 * (n - a); c++){
                System.out.print(" ");
            }

            for(int b = 1; b <= a; b++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

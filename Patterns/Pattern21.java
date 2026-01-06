public class Pattern21 {
    public static void main(String[] args) {
        int n = 7;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 4; j++){
                if( i % 2 == 0){
                    System.out.print(" ");
                }
                else if ( i == 1 || i == n){
                    System.out.print("*");
                }
                else {
                    System.out.print("*" + " "+ " "+ "*");
                    break;
                }
            }
            System.out.println();
        }
    }
}

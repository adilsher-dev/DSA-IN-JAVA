public class Pattern17{
    public static void main(String[] args) {

        int n = 4;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= (n-i);j++){
                System.out.print(" ");
            }
            for(int k = 65; k < 65 + i ; k++){
                System.out.print((char)k);
            }

        for(int l = 65 + i -2;l >= 65 ; l-- ){
            System.out.print((char)l);
        }
        System.out.println();
    }
}
}

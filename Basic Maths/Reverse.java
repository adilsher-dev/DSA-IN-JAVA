public class Reverse {
    public static void main(String[] args) {

        int x  = 1534236469;

        int rev = 0;

        while( x != 0 ){
            int digit = x % 10;
            x  = x / 10;

            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println(0);
            }

            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println(0);
            }

            rev =  rev * 10 + digit;
        }
        System.out.println("The reverse Number is:"+rev);
    }
}


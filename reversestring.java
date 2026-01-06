public class reversestring {
    public static void main(String[] args) {
        String s = "adil";
        String r = "";

        for(int i = s.length() - 1; i>=0;i--){
            r += s.charAt(i);
        }
        System.out.println(r);
    }
}

public class exception {
    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("Cannot Be Divided By Zero");
        } finally {
        System.out.println("Program Continues");
        }
    }
}

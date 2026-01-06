import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        
        int [] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);

        int attempts = 0;

        while(attempts < 5){
            try {
                System.out.println("Enter the Index");
                int index = sc.nextInt();

                System.out.println("Index :" + index  + "Value at this index :" + arr[index]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                attempts++;
                System.out.println("Invalid Index! Try Again");
            }
        }
        if (attempts == 5){
            System.out.println("End");
        }
        sc.close();
    }
}

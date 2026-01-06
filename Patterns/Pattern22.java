public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;

        for(int i = 0; i < size ; i++){
            for(int j = 0; j < size ; j++){

                int top = i;
                int left = j;
                int right = size - j - 1;
                int bottom = size - i - 1;

                int minDistance = Math.min(Math.min(top,bottom),Math.min(left,right));
                int value =  n - minDistance;
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
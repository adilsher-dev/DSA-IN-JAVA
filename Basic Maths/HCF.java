class Test{
    public int x;
    public int y;

    public Test(int x1,int y1){
        x = x1;
        y = y1;
    }

public int gcd(int x, int y){
    if (y == 0){
        return x;
    }
    else {
        return gcd(y,x%y);//euclid's algorihtm this is
    }
}
}


public class HCF {
    public static void main(String[] args) {

        Test obj = new Test(24,36);
        int result = obj.gcd(24,36);
        System.out.println(result);
    }
}

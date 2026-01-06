class Super{
    public void meth1(){
        System.out.println("This is a Meth1");
    }
    public void meth2(){
        System.out.println("This is a Meth2");
    }
}
class Sub extends Super{
    public void meth2(){
        System.out.println("This is a Sub Meth2");
    }
    public void meth3(){
        System.out.println("This is a Meth3");
    }
}
public class Override {
    public static void main(String[] args) {
        Super obj = new Sub();
        obj.meth2();
       // obj.meth3();Super is reference type and Sub is obj type and compile time par reference type ke hisaab se cheezein hoti hai and Super ko kuch nhi malum hai meth3 ke baree me isliye error aarha hai compile time errror
    }
    
}

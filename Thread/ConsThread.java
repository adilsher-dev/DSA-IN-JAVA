class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
            System.out.println("I am a thread");
        }
    }



public class ConsThread {

    public static void main(String[] args) {
        MyThr t = new MyThr("Harry");
        t.start();
        // System.out.println(t.getId());
        System.out.println(t.getName());
    }
}

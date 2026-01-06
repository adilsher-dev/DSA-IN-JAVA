class MyThread1 extends Thread{

    public void run(){
        System.out.println("Thread1 is Running");
    }
}

class MyThread2 extends Thread{

    public void run(){
        System.out.println("Thread2 is Running");
    }
}

public class thread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();



        
    }
}


public class Threads1 extends Thread {

    public static void main(String[] args) {
        Threads1 thread =new Threads1();
        thread.start(); // Start the thread
        System.out.println("This code is running in the main thread");
    
}


    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

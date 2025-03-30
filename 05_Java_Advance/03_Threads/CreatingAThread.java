

//It can be created by extending the Thread class and overriding its run() method:
public class CreatingAThread extends Thread {
        public void run() {
          System.out.println("This code is running in a thread");
        }
      }


//Another way to create a thread is to implement the Runnable interface:

/* 
public class CreatingAThread implements Runnable {
    public void run() {
      System.out.println("This code is running in a thread");
    }
  } 
 
  */
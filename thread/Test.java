package thread;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyThread3 myThread = new MyThread3();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread3 extends Thread {
    private volatile boolean running = true;
    // volatile используется для обозначения переменных, которые могут быть изменены разными потоками.
    
    public void run() {
        while(running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}

package thread;

class MyThread2 extends Thread {     //MyThread теперь поток
    public void run() {
        for (int i = 0; i < 400; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}

// Второй способ, где класс реализует интерфейс Runnable
class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}
public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        // Многопоточность позволяет нам выполнять какой-то код паралельно с другим кодом
        // Многопоточность может работать если у вас одноядерный или многоядерный компьютер
        // Многопоточность в java представлена в виде виртуальной паралельности

        // Основная цель многопоточного программирования в том чтобы реализовать
        // какой-то функционал, тоесть например клиент не ждал чего-то, чтобы 
        // какие-то сложные задачи обрабатывались где-то там на фоновом режим.

        // 2 способа создания потоков:
        // 1. создаем класс и в этом классе наследуемся от класса Thread
        // MyThread2 myThread = new MyThread2();
        // myThread.start();

        // MyThread2 myThread2 = new MyThread2();
        // myThread2.start();

        // System.out.println("I am going to sleep");
        // Thread.sleep(3000);
        // System.out.println("I am wake!");

        Thread thread = new Thread(new Runner());
        thread.start();

        System.out.println("Hello from main thread");
    }
}
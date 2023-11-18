package thread;

class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("I'm Thread! My name is " + getName());
    }
}

public class Test1 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }
    }
}
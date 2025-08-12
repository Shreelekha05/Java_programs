package thread;
public class threadname {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            Thread.currentThread().setName("Scooby");
            System.out.println("Thread name: " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            Thread.currentThread().setName("Shaggy");
            System.out.println("Thread name: " + Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

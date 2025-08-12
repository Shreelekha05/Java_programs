package thread;
import java.util.Random;

class ColorTask implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random random = new Random();
    String threadName;

    public ColorTask(String name) {
        this.threadName = name;
    }

    public void run() {
        Thread.currentThread().setName(threadName);
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(colours.length);
            System.out.println(Thread.currentThread().getName() + ": " + colours[index]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Randomcolor {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ColorTask("Scooby"));
        Thread t2 = new Thread(new ColorTask("Shaggy"));

        t1.start();
        t2.start();
    }
}

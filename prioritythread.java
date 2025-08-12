package thread;
class prioritythread extends Thread {
    public prioritythread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running");
    }

    public static void main(String[] args) {
        prioritythread t1 = new prioritythread("Thread-1");
        prioritythread t2 = new prioritythread("Thread-2");
        prioritythread t3 = new prioritythread("Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY); 
        t2.setPriority(Thread.MAX_PRIORITY); 
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

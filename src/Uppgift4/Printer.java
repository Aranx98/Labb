package Uppgift4;

public class Printer implements Runnable{
    private final int start;
    private final int stop;

    static boolean primtal(int s) {
        if (s == 1 || s == 0) return false;

        for (int i = 2; i < s; i++) {
            if (s % i == 0) return false;
        }
        return true;

    }

    public Printer(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        for (int i = start; i < stop; i++) {
            if (primtal(i)){
                System.out.println(Thread.currentThread().getName()+ " = " +i);
            }
        }
    }

}

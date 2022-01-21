package Uppgift4;

public class Main {
    public static void main(String[] args) {
        Runnable thread1=new Printer(0,250000);
        Thread t1=new Thread(thread1);

        Runnable thread2=new Printer(250001,300000);
        Thread t2=new Thread(thread2);

        Runnable thread3=new Printer(300001,500000);
        Thread t3=new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();


    }
}

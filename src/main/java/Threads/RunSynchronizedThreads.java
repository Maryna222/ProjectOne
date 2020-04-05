package Threads;

public class RunSynchronizedThreads extends Thread{

    public void run(){
        //int j = 0;
        for (int i = 0; i < 10; i++) {
            //j = (int) (Math.random() * 40);
            System.out.println("Случайные числа " + i);
        }
    }
}


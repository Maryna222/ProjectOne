package Threads;

import java.util.Arrays;

public class RunThreads extends Thread {

    public void run() {
//        int j = 0;
//        for(int i=0; i < 5; i++ ){
//            j = (int)(Math.random()*40);
//            System.out.println(j);
//        }

        int [] mas1 = new int[5];
        for(int i=0; i < mas1.length; i++ ){
            mas1[i] = (int)(Math.random()*40);
            System.out.printf("  " + mas1[i]);
        }
        System.out.println();

    //Uncomment for task 1 RunSynchronizedThreads
//    public synchronized void run() {
//        //int j = 0;
//        for (int i = 0; i < 10; i++) {
//            //j = (int) (Math.random() * 40);
//            System.out.println("Случайные числа " + i);
//        }
    }
}

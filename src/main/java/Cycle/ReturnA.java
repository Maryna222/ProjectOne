package Cycle;

public class ReturnA {
    public static void printA() {
        int a = 20;
        System.out.println("Цикл с предусловием");
        while(a > 10){
            a--;
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("Цикл с постусловием");
        //a = 30; //if uncomment then the cycle starts from 30
        do {
            System.out.print(a + " ");
            a--;
        }
        while (a > 10);
    }

    public static void printFive() {
        /*range [0;40) - (int)(Math.random()*40)*/

        int [] mas = new int[10];

        for(int i=0; i < mas.length; i++ ){
            mas[i] = (int)(Math.random()*40);
            //System.out.print(mas[i]+" ");
        }
        for (int i : mas) {
            if(i == 5)
                System.out.println(i);
        }


    }
}

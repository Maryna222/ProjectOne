package Modifikators;

public class FirstClass {

    public void printMeAll(){
        System.out.println("printMeAll - это публичный метод первого класса");
    }

    private void printMePrivate(){
        System.out.println("printMeAll - это приватный метод первого класса");
    }

    protected int returnNumber (){
        int x = 25;
        return x*x;
    }

    public static void testStatic(){
        int k;
        k = 10;
        System.out.println (k);
    }




}

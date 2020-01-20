package Symbols;

import java.util.Arrays;

public class AddHello {
    public static void addWord(){
        /*range [0;40) - (int)(Math.random()*40)*/

        int [] mas2 = new int[15];

        System.out.println("К массиву: ");
        for(int i=0; i < mas2.length; i++ ){
            mas2[i] = (int)(Math.random()*40);
            System.out.print(mas2[i]+" ");
        }
        System.out.println("\nДобавим слово Hello: ");
        StringBuffer newVar = new StringBuffer();
        for (int j = 0; j < mas2.length; j++){
            newVar.append(mas2[j] + "hello ");
        }
        System.out.print(newVar + " ");

        /*Old variant
        String strArr2[] = new String[mas2.length]; //стрингбуфер
        for (int j = 0; j < strArr2.length; j++){
            strArr2[j] = mas2[j] + "hello";
            System.out.print(strArr2[j] + " ");
        }*/
    }
}

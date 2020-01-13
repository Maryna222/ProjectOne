import java.util.Arrays;

public class Convert {
    public static void getConvert(){
        /*range [0;40) - (int)(Math.random()*40)*/

        int [] mas2 = new int[15];
        String myArray;

        System.out.println("Заполним созданный массив данными: ");
        for(int i=0; i < mas2.length; i++ ){
            mas2[i] = (int)(Math.random()*40);
            System.out.print(mas2[i]+" ");
        }
        System.out.println("\n Преобразуем данный массив в строку: ");
        myArray = Arrays.toString(mas2);
        System.out.print(myArray+" - это строка");



    }

}

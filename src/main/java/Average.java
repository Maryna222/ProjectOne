import static java.lang.Math.random;
import java.util.Arrays;

public class Average {
    public static void getAverage(){
        /*range [0;40) - (int)(Math.random()*40)*/

        int [] mas1 = new int[15];
        int tmpSum = 0;
        int tmpAverage;

        for(int i=0; i < mas1.length; i++ ){
            mas1[i] = (int)(Math.random()*40);
        }

        for(int i=0; i < mas1.length; i++ ){
            tmpSum += mas1[i] ;
        }
        tmpAverage = tmpSum/mas1.length;
        System.out.println("Среднее арифметическое массива "+Arrays.toString(mas1)+" равно "+tmpAverage);
    }
}

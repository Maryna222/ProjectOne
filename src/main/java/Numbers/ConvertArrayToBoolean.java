package Numbers;

public class ConvertArrayToBoolean {
    public static void convertArrayToBool(){
        /*range [0;40) - (int)(Math.random()*40)*/


        System.out.println("Преобразуем массив: ");
        String strArr2[] = {"Январь","False","Март","Обед","True","Мяч","Новый","Июнь","Август"};
        for (int i = 0; i < strArr2.length; i++){
            System.out.print(strArr2[i] + " ");
        }

        System.out.println("\nВ Boolean: ");
        boolean bool1;

        for (int j = 0; j < strArr2.length; j++){
            bool1 = Boolean.parseBoolean(strArr2[j]) ;
            System.out.print(bool1 + " ");
        }
    }
}

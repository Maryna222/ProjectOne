import java.util.Scanner;

public class Factorial {
    public static void printFactorial(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое натуральное число : ");
        int num = in.nextInt();
        if (num > 63){
            System.out.print("Введите, пожалуйста число в диапазоне до 63: ");
            int num2 = in.nextInt();
            System.out.printf("Факториал числа: %d! равен %d ", num2, Factorial.getFactorial(num2));
        } else {
            System.out.printf("Факториал числа: %d! равен %d ", num, Factorial.getFactorial(num));
        }

        in.close();
    }


    public static long getFactorial(long num) {
        long result = 1;

        if(num == 0) {
            System.out.printf("Факториал числа: %d! равен 1 ", num);
        } else{
            for (int i = 1; i <= num; ++i)
                result *= i;
        }
        return result;
    }
}

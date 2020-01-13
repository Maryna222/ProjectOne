import java.util.Scanner;

public class Factorial {
    public static void printFactorial(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое натуральное число до 63: ");
        int num = in.nextInt();
        System.out.printf("Факториал числа: %d! равен %d ", num, Factorial.getFactorial(num));
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

import java.util.Scanner;

public class DetermineInteger {
    public static void printNumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число, чтобы узнать его четность: ");
        int number = in.nextInt();

        if(number%2==0){
            System.out.printf("Число %d четное", number);
        }else{
            System.out.printf("Число %d нечетное ", number);
        }
        in.close();
    }

}

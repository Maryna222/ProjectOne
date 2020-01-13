import java.util.Scanner;

public class CodePrice {

        public static void printPrice(){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите код продукта чтобы узнать его цену: ");
            int code = in.nextInt();
            if(CodePrice.getPrice(code)==0){
                System.out.println("Вы ввели неподходящий код");
            }else{
                System.out.printf("Цена продукта с кодом %d составляет %d ", code, CodePrice.getPrice(code));
            }

            in.close();
        }


        public static long getPrice(long code) {

            if (code>=0 && code<100) {
                return 500;
            } else if (code>=100 && code<200 ) {
                return 589;
            } else if (code>=200 && code<300 ) {
                return 643;
            }else if (code>=300 && code<400 ) {
                return 698;
            }else if (code>=500 && code<600 ) {
                return 700;
            }else if (code>=600 && code<800 ) {
                return 756;
            }else if (code>=900 && code<1000 ) {
                return 900;
            }else if (code>=1000 && code<1500 ) {
                return 950;
            }else if (code>=1500 && code<3000 ) {
                return 1023;
            }else if (code>=3000 && code<5000 ) {
                return 1523;
            }else if (code>=5000 && code<10000 ) {
                return 2000;
            }else if (code>=10000 && code<100000 ) {
                return 10000;
            }else {
                return 0;
            }


        }
}

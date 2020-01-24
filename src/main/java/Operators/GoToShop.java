package Operators;

import java.util.Scanner;

public class GoToShop {
    public static void printResulOfChoice() {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        System.out.print("Введите время суток, например, час дня, это 13: ");

        int time = in.nextInt();
        System.out.print("Введите сумму денег, которая у вас есть:");
        int money = in2.nextInt();

        if (time >= 8 && time <= 12 && money >= 10) {
            System.out.print("Супер - идем в магазин!");
        } else if (time > 12 && time < 24 && money >= 50) {
           System.out.print("Отлчные новости - идем в кафе!");
        }else if (time < 19 && time < 24 && money < 50) {
            System.out.print("Что приуныл? Пошли к соседу!");
        } else if (time > 19 && time < 22) {
            System.out.print("Немного отдыхнем - посмотрим телевизор");
        }else if (time > 22 && time < 24) {
            System.out.print("При чем тут деньги??? Пошли спать!!!!");
        }else{
            System.out.printf("В данное время суток %d с таким количеством денег %d мы никуда не идем((", time, money);
        }

        in.close();
    }
}





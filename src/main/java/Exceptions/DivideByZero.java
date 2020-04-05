package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DivideByZero {
    public void divideMethod(int x, int y){
        int result = 0;
        try{
            result = x/y;
            System.out.println("Результат деления : " + result);
        }catch(ArithmeticException e){
            System.out.println("На ноль делить нельзя!!!");

        }
    }

    public void divideFin(int x, int y){
        int result2 = 0;
        try{
            result2 = x/y;
            System.out.println("Результат деления : " + result2);
        }finally {
            throw new ArithmeticException("На ноль делить нельзя!!!");
//            if(y==0){
//                System.out.println("На ноль делить нельзя!!!");
//            }
        }
    }

    public static void exeptFile(String way) throws FileNotFoundException {
        File file = new File("way");
        Scanner find = new Scanner(file);
        if (find == null){
            throw new FileNotFoundException();
        }
    }

    public static void exeptNull(Integer s){

        if (s == null){
            try{
                throw new NullPointerException();
            } catch (NullPointerException e){
                System.out.println("S не должно быть NULL");
            }
        } else{
            System.out.println("Результат " + s);
        }
    }
}

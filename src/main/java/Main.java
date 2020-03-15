import ClassLesson.Test;
import Constructor.ClassWithConstructors;
import Generics.ClassGenerics;
import Interf.Dog;
import Interf.DogDog;
import Modifikators.FirstClass;
import Modifikators.SecondClass;
import Modifikators.ThirdClass;
import Operators.GoToShop;

public class Main  {
    public static void main (String[] args) {
        /*Home task 1 - need to print the text "Hello World"----------------------------------------*/
        //Numbers.PrintHelloWorld.printHW();
        /*Home task 2.1 - need to find the average an array----------------------------------------*/
        //Numbers.Average.getAverage();
        /*Home task 2.2 - need to find Numbers.Factorial of a number---------------------------------------*/
        //Numbers.Factorial.printFactorial();
        /*Home task 2.3 - need to print the price--------------------------------------------------*/
        //Numbers.CodePrice.printPrice();
        /*Home task 2.4 - need to determine integer--------------------------------------------------*/
        //Numbers.DetermineInteger.printNumber();
        /*Home task 2.5 - need to convert array into string------------------------------------------*/
        //Symbols.Convert.getConvert();
        /*Home task 2.6 - need to add a word Hello to the end of array element------------------------*/
        //Symbols.AddHello.addWord();
        /*Home task 2.7 - need to convert array into boolean------------------------------------------*/
        //Numbers.ConvertArrayToBoolean.convertArrayToBool();
        /*Home task - Operators --------------------------------------------------------------------------------------------*/
        //GoToShop.printResulOfChoice();
        /*Home task - Cycles --------------------------------------------------------------------------------------------*/
        //Cycle.ReturnA.printA();
        //Cycle.ReturnA.printFive();

        /*Home task 3.0 create class Test--------------------------------------------------------------------------*/

//        Test tmp = new Test();
//        tmp.getClassname(" test");
//        //second task 3.1
//        Test new1 = new Test();
//        Test new2 = new Test();
//
//        new1.getClassname(" param1");
//        new2.getClassname(" param2");

        /*Task about OOP------------------------------------------------------------------*/
        // Interf.Dog dog = new Dog();
        //1+2 points
        /*System.out.println("Рост собаки - " + dog.Height(50) + " сантиметров");
        System.out.println("Вес собаки в кг - " + dog.Weight(5));
        System.out.println("Собака бежит - " + dog.traffic(5) + " км/час");
        dog.eat();*/
        /*//4 point
        System.out.println("Рост собаки в футах - " + dog.Height(5.0));
        System.out.println("Первая буква в словосочитании \"Рост собаки\" это - " + dog.Height('Р'));

        System.out.println("Вес собаки в граммах - " + dog.Weight(5.0));

        System.out.println("Собака бежит - " + dog.traffic(5.0) + " миль/час");*/
        /*//3 point
        Interf.DogDog dogDog = new DogDog();
        System.out.println("Рост собаки - " + dogDog.Height(50) + " сантиметров");
        System.out.println("Вес собаки - " + dogDog.Weight(5) + " кг");
        System.out.println("Собака бежит - " + dogDog.traffic(5) + " км/час");*/


        /*Modifikators home work-----------------------------------------------*/
        /*//1+2 points
        SecondClass newValue = new SecondClass();
        newValue.printMeAll();

        //newValue.printSecond();
        //System.out.println("Вызван protected метод первого класса - " + newValue.returnNumber()); //- ошибка, почему?*/
        // ------------------------------------------
        /*//3 point
        ThirdClass newTmp = new ThirdClass();
        newTmp.printMeAll(); - ошибка, так как нет наследования
        newTmp.printMePrivate(); - ошибка, так как нет наследования*/
        // ------------------------------------------
        /*//4 point*/
//        SecondClass secondValue = new SecondClass();
//        System.out.println("Вызван static метод первого класса:");
//        secondValue.testStatic();
//        //вариант2:
//        System.out.println("Вызван static метод первого класса:");
//        SecondClass.testStatic();


        //------------------------------------------------------------------------------------------------------------
        /*The home task for Constructors
        //------------------------------------------------------------------------------------------------------------
         * №1 */
//        String paramName = ClassWithConstructors.class.getSimpleName();
//        ClassWithConstructors tmp = new ClassWithConstructors(paramName);
//        tmp.getClassName();
        /* №2 */
//        String paramName2 = ClassWithConstructors.class.getSimpleName();
//        ClassWithConstructors tmp = new ClassWithConstructors(paramName2, "Maryna");
//        tmp.getClassNameConcat();

        //-------------------------------------------------------------------------------------------------------------
        /*The home task for Generic
        //-------------------------------------------------------------------------------------------------------------
         * №1,2 */
        /*Simple variant----------------------
        ClassGenerics<String> tmp = new ClassGenerics<String>();
        String[] mas1 = {"Tom", "Jerry", "Kymmi", "Haba", "Lakka", "Lunt"};
        tmp.printRandom(mas1);

        ClassGenerics<Integer> tmp2 = new ClassGenerics<Integer>();
        Integer[] mas2  = {1, 2, 3, 4, 5, 2, 13, 456, 4};
        tmp2.printRandom(mas2);
        ----------------------------------------*/
        /*№1,2 more specific - with constructors */
//        ClassGenerics<String> tmp3 = new ClassGenerics<String>("Tom", "Jerry", "Kymmi", "Haba", "Lakka", "Lunt");
//        tmp3.printRandom();
//
//        ClassGenerics<Integer> tmp4 = new ClassGenerics<Integer>(1, 2, 3, 4, 5, 2, 13, 456, 4);
//        tmp4.printRandom();

        //------------------------------------------------------------------------------------------------------------
        /*The home task for Exception 
        //------------------------------------------------------------------------------------------------------------

    }
       /*Main tmp = new Main();
        tmp.newTest();
        public void newTest (){}*/
}

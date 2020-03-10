package Interf;

public class Dog implements Animals {


   public int height(int x) {
        return x + x;
   }
   public double height(double x) {
        return x / 3.2808;
   }
   public char height(char x) {
        return x;
   }

   public int weight(int x) {
       return x * x;
   }
   public double weight(double x) {
       return x / 1000;
   }

   public int traffic (int x){
       return x % 2;
   }
   public double traffic(double x) {
        return x / 1.069;
   }

   public void eat (){
        System.out.println("Собака ест");
   }
}

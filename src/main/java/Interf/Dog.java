package Interf;

public class Dog implements Animals {

   // @Override
   public int Height(int x) {
        return x + x;
   }
   public double Height(double x) {
        return x / 3.2808;
   }
   public char Height(char x) {
        return x;
   }

   public int Weight(int x) {
       return x * x;
   }
   public double Weight(double x) {
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

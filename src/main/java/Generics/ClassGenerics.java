package Generics;

public class ClassGenerics<T> {
    public T[] items;


      public ClassGenerics(T... items){
          this.items = items;
      }

      public void printRandom() {

          for (T i : items) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    /* //Simple variant
    public <T> void printRandom(T[] items){
        for (T i: items) {
            System.out.print(i + " ");

        }
        System.out.println();
    }*/


}

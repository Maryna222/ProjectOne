public class AddHello {
    public static void addWord(){
        /*range [0;40) - (int)(Math.random()*40)*/

        int [] mas2 = new int[15];
        
        System.out.println("К массиву: ");
        for(int i=0; i < mas2.length; i++ ){
            mas2[i] = (int)(Math.random()*40);
            System.out.print(mas2[i]+" ");
        }
        System.out.println("\nДобавим слово Hello: ");
        String strArr2[] = new String[mas2.length];
        for (int j = 0; j < strArr2.length; j++){
            strArr2[j] = mas2[j] + "hello";
            System.out.print(strArr2[j] + " ");
        }
    }
}

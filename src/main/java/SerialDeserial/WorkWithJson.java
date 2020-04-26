package SerialDeserial;

import com.google.gson.Gson;

public class WorkWithJson {

    public static void someMethod(){
        Gson gson2 = new Gson();
        String[] names = {"Коля", "Вася", "Петя"};
        String toJson = gson2.toJson(names);
        System.out.println(toJson);
        //System.out.println(gson2.toJson(names));

        String[] namesRestoreToMas = gson2.fromJson("[\"Коля\", \"Вася\", \"Петя\"]", String[].class);
        System.out.print("[ ");
        for (String i: namesRestoreToMas) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }


}

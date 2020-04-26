package DeserializationRealFile;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class GetNames {

    public void getNameMethod() {
        File jsonAllInputFile = new File("testJson.json");
        InputStream inputStream; //поток ввода
        try {
            inputStream = new FileInputStream(jsonAllInputFile); //чтение инфо с файла
            JsonReader reader = Json.createReader(inputStream); //читаем документ
            JsonObject allObject = reader.readObject(); //преобразовываем считанное в объект Json
            reader.close();

            JsonArray arrObjData = allObject.getJsonArray("data"); //олучаем массив
            System.out.println("\nData:");
            JsonObject valueToObj;
            JsonObject getName;
            for (JsonValue value : arrObjData) {
                System.out.println(value.toString()); //выводим каждый элемент масива в виде строки
                valueToObj = value.asJsonObject(); //преобразовуем элемент масива в объект
                getName = valueToObj.getJsonObject("from"); // получаем объект from с каждого значения массива
                System.out.println("Name: " + getName.getString("name")); //получаем и выводим name
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден ");
            e.printStackTrace();
        }
    }
}

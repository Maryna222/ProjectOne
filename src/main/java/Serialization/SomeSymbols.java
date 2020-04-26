package Serialization;

import java.io.Serializable;

public class SomeSymbols implements Serializable {
    private String a;
    private String b;


    public SomeSymbols(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "SomeSymbols {" +
                " \"a\" : \"" + a + '\"' +
                ", \"b\" : \"" + b + '\"' +
                '}';
    }
}

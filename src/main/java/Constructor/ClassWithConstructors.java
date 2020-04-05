package Constructor;

public class ClassWithConstructors {
    private String classname;
    private String name;

    public ClassWithConstructors(String param) {
        classname = param;
    }

    public ClassWithConstructors(String param1, String param2) {
        classname = param1;
        name = param2;
    }

    public String getClassName() {
        System.out.println("The name of this class is " + classname);
        return classname;
    }

    public String getClassNameConcat() {
        System.out.println("The name of this class is " + classname + " and author name is " + name);
        return classname;
    }
}

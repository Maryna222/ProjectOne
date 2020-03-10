package ClassLesson;

public class Test {

    public String getClassname(String param) {
        String classname = Test.class.getSimpleName();
        System.out.println(classname + param);
        return classname;
    }


}

package Task1;

public class Main{
    public static void main(String[]args) {
        Methods methods = new Methods();
        methods.methodA("go");
        System.out.println("flows.methodA(\"start\");");
        methods.methodA("start");
        System.out.println("flows.methodB(\"Hello, world\");");
        methods.methodB("Hello, world");
        System.out.println("flows.methodC(\"Hello, world\");");
        methods.methodC("Hello, world");
        System.out.println("flows.methodD(25);");
        methods.methodD(25);
    }
}
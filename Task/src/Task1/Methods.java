package Task1;

public class Methods {

    public void methodA(String input) {
        System.out.println("j");
        if (!input.equals("start")) {
            System.out.println("a");
            methodB("start");
        } else {
            System.out.println("a");
            System.out.println(methodC(input));

        }
        System.out.println("t");
    }

    public void methodB(String start) {
        System.out.println("er");
        methodC("fun");
    }

    public int methodC(String input) {
        System.out.println("s");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("j");
        if (number > 5) {
            System.out.println("o");
        } else {
            System.out.println("v");
        }
        System.out.println("e");
        }
    }




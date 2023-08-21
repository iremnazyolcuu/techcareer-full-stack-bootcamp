package javaSE;

public class _08_Methods {
    public static void voidWithNoParameters() {
        System.out.println("void with no parameters");
    }

    public static void voidWithParameters(String name) {
        System.out.println("void with parameters: " + name);
    }

    public static Integer returnWithNoParameters() {
        return Math.abs(-14);
    }

    public static Integer returnWithParameters(int number) {
        return Math.abs(number);
    }

    public static void main(String[] args) {
        voidWithNoParameters();
        voidWithParameters("Java");

        int result1 = returnWithNoParameters();
        System.out.println(result1);

        int result2 = returnWithParameters(-16);
        System.out.println(result2);
    }

}
public class DataTypesDemo {
    public static void demonstrate() {
        int a = 7;
        int b = 5;
        int intSum = a + b;

        float x = 3.5f;
        float y = 2.2f;
        float floatSum = x + y;

        System.out.println("Integer addition: " + a + " + " + b + " = " + intSum);
        System.out.println("Float addition: " + x + " + " + y + " = " + floatSum);
        System.out.println();
        displayPrimitiveSizesAndRanges();
    }

    private static void displayPrimitiveSizesAndRanges() {
        System.out.println("Primitive type sizes and ranges:");
        System.out.println("byte:   size = " + Byte.SIZE + " bits, range = " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short:  size = " + Short.SIZE + " bits, range = " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int:    size = " + Integer.SIZE + " bits, range = " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long:   size = " + Long.SIZE + " bits, range = " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float:  size = " + Float.SIZE + " bits, range = " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: size = " + Double.SIZE + " bits, range = " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char:   size = " + Character.SIZE + " bits, range = " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean: size = 1 bit (logical), values = true or false");
    }
}

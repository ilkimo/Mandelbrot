import java.math.BigDecimal;

public class Test {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void test1() {
        ComplexNumber z, w;
        z = new ComplexNumber(new BigDecimal("1.1000001"), new BigDecimal("1.1"));
        w = new ComplexNumber(new BigDecimal("2.2"), new BigDecimal("2.2"));
        System.out.print("z + w = ");
        z.add(w).print();
        System.out.println("z + w length = " + z.add(w).getLength());

        System.out.print("z.pow(2) = ");
        z.pow(2).print();
        System.out.println("and length = " + z.pow(2).getLength());
    }

    public static void main(String[] args) {
        test1();

    }
}

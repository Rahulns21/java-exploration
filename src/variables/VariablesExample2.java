package variables;

public class VariablesExample2 {
    public static void main(String[] args) {

        // swapping variables
        String x = "water";
        String y = "Ice";

        /* Swapping using temporary variable */
        String temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);

    }
}
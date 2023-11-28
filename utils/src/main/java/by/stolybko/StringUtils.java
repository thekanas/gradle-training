package by.stolybko;

public class StringUtils {

    public static boolean isPositiveNumber(String str) throws IllegalArgumentException {
        try {
            return Double.parseDouble(str) > 0;
        } catch (NullPointerException | NumberFormatException e) {
            throw new IllegalArgumentException("invalid input data");
        }
    }
}

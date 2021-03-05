package part05;

public class WrapperTypes02 {
    public static void main(String[] args) {
        Integer integerNumber = 3;
        Float floatNumber = integerNumber.floatValue(); // 3.0f
        Double doubleNumber = integerNumber.doubleValue();; // 3.0d
        String stringNumber = integerNumber.toString(); // "3"
    }
}

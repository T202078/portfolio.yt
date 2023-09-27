import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.print("Enter a binary number: ");
            String binary = scanner.nextLine();

            int decimal = binaryToDecimal(binary);
            System.out.println("Decimal equivalent: " + decimal);
        }
    }
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char digit = binary.charAt(i);
            int power = length - 1 - i; 

            if (digit == '1') {
                decimal += Math.pow(2, power);
            } else if (digit != '0') {
                System.out.println("Invalid binary digit: " + digit);
                return -1;
            }
        }

        return decimal;
    }
}
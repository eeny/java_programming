package part6;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("정수를 입력하세요.");
        System.out.println("정수 2개를 띄어서 입력하세요.");
//
//        int number1 = Integer.parseInt(scanner.nextLine());
//        System.out.println("정수를 입력하세요.");
//        int number2 = Integer.parseInt(scanner.nextLine());
//        int result = number1 + number2;

        int number1 = Integer.parseInt(scanner.next());
        int number2 = Integer.parseInt(scanner.next());
        int result = number1 + number2;

        System.out.println("두 정수를 더하면 " + result + "입니다.");
    }
}

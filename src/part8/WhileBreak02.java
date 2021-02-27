package part8;

import java.util.Scanner;

public class WhileBreak02 {
    public static void main(String[] args) {
        String password = "chicken1004";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("비밀번호를 입력하세요.");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("비밀번호가 일치합니다.");
                break;
            }

            System.out.println("비밀번호가 틀립니다.");
        }
    }
}

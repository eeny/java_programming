package part09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("저장할 문자열을 입력하세요. 미입력시 종료됩니다.");

        try {
            FileWriter writer = new FileWriter("src/part09/output05.txt");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("입력을 종료합니다.");
                writer.close();
            } else {
                while (!input.isEmpty()) {
                    writer.write(input + "\n");
                    System.out.println("추가할 문자열을 입력하세요.");
                    input = scanner.nextLine();
                    if (input.isEmpty()) {
                        System.out.println("입력을 종료합니다.");
                        writer.close();
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            System.exit(11);
        }
    }
}

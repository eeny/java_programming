package part09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput03 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/part09/acronym5.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            System.exit(10);
        }

        Scanner scanner = new Scanner(inputStream);

//        String line = scanner.nextLine();
//        System.out.println(line);
//        line = scanner.nextLine();
//        System.out.println(line);
//        line = scanner.nextLine();
//        System.out.println(line);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}

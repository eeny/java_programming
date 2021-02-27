package part8;

public class Continue01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i = i + 1) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

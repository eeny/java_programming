package part8;

public class Continue02 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            if (i % 2 == 0) {
               i = i + 1; //i의 값을 증가시키지 않으면 i의 값이 안변해서 무한 반복됨
                continue;
            }
            System.out.println(i);
            i = i + 1;
        }
    }
}

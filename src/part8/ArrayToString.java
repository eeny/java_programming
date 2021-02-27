package part8;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};

        System.out.println(days);
        System.out.println(days.toString());
        System.out.println(Arrays.toString(days));
    }
}

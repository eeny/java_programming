package part6;

import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
//        A씨가 판매하는 사료는 하루에 강아지의 몸무게 1kg당 10g의 사료를 급여하도록 권장하고 있습니다.
//        강아지의 몸무게를 입력받아 1일 권장 사료 급여량을 계산하고 출력하세요.
        Scanner scanner = new Scanner(System.in);
        System.out.println("강아지의 몸무게를 입력해주세요.");

        //내가 입력한 답
//        int dogWeight = Integer.parseInt(scanner.nextLine());
//        int amountOfDogFood = dogWeight * 10;
//        System.out.println("1일 권장 사료 급여량은 " + amountOfDogFood + "g 입니다.");

        //정답
        try {
            double dogWeight = Double.parseDouble(scanner.nextLine());
            double amountOfDogFood = dogWeight * 10;
            System.out.println("1일 권장 사료 급여량은 " + amountOfDogFood + "g 입니다.");
        } catch (Exception e) {
            System.out.println("숫자를 변환하는 동안 오류가 발생했습니다.");
        }
    }
}

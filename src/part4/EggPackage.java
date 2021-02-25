package part4;

public class EggPackage {
    public static void main(String[] args) {
        // 내 풀이
        int egg = 277;
        System.out.println(egg % 30);

        //책 풀이
        int totalEgg = 277;
        int eggCartonSize = 30;
        int remainingEggs = totalEgg % eggCartonSize;
        System.out.println("총" + remainingEggs + "개의 계란이 남습니다.");
    }
}

package part8;

public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("지금 무슨 생각을 하고 있는지 맞춰볼게요.");

        try {
            Thread.sleep(3000); //3초
        } catch (Exception e) {
            System.out.println("Thread.sleep 실패");
        }

        System.out.println("치킨!");
    }
}

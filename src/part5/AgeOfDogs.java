package part5;

public class AgeOfDogs {
    public static void main(String[] args) {
        int winterAge = 3;
        int maxAge = 6;
        boolean winterAndMaxSameAge = winterAge == maxAge;
        boolean winterOlderThanMax = winterAge > maxAge;
        boolean maxOlderThanWinter = maxAge > winterAge;
        System.out.println("윈터의 나이가 맥스의 나이와 같은가? " + winterAndMaxSameAge);
        System.out.println("윈터의 나이가 맥스의 나이보다 많은가? " + winterOlderThanMax);
        System.out.println("맥스의 나이가 윈터의 나이보다 많은가? " + maxOlderThanWinter);
    }
}

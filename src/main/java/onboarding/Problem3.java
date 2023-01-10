package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            answer += count(i);
        }

        return answer;
    }

    public static int count(int number) {
        int count = 0;
        String castedNumber = String.valueOf(number);
        for (int i = 0; i < castedNumber.length(); i++) {
            if (isClap(castedNumber.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static boolean isClap(char number) {
        return number == '3' || number == '6' || number == '9';
    }
}

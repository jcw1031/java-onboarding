package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                ch = checkUpperOrLower(ch);
            }
            answer += ch;
        }

        return answer;
    }

    public static char checkUpperOrLower(char ch) {
        if (Character.isUpperCase(ch)) {
            return upperCaseConvert(ch);
        }
        return lowerCaseConvert(ch);
    }

    public static char upperCaseConvert(char ch) {
        return (char) ('A' + 'Z' - ch);
    }

    public static char lowerCaseConvert(char ch) {
        return (char) ('a' + 'z' - ch);
    }
}

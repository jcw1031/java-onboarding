package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static String solution(String cryptogram) {
        return decoder(cryptogram);
    }

    public static String decoder(String cryptogram) {
        List<Character> string = new ArrayList<>();

        for (int i = 0; i < cryptogram.length(); i++) {
            string.add(cryptogram.charAt(i));
        }

        while (true) {
            if (string.size() < 2) {
                break;
            }
            int i=1;
            int size = string.size();
            for (; i < size; i++) {
                if (string.get(i).equals(string.get(i - 1))) {
                    string.remove(i-1);
                    string.remove(i-1);
                    break;
                }
            }

            if (i == size) {
                break;
            }
        }

        StringBuilder cryptogramBuilder = new StringBuilder();
        for (Character c : string) {
            cryptogramBuilder.append(c);
        }
        cryptogram = cryptogramBuilder.toString();
        return cryptogram;
    }

}

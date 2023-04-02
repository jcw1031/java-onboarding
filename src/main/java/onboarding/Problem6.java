package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {

    public static final int USER_EMAIL_INDEX = 0;
    public static final int USER_NICKNAME_INDEX = 1;

    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = new ArrayList<>();
        boolean[] isChecked = new boolean[forms.size()];

        for (int i = 0; i < forms.size(); i++) {
            if (isChecked[i]) {
                continue;
            }
            String nickname = forms.get(i).get(USER_NICKNAME_INDEX);
            for (List<String> comparisonTarget : forms) {

            }
        }

        return answer;
    }

    private boolean isNotOverlap() {
        return false;
    }
}

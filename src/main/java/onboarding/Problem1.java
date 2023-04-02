package onboarding;

import java.util.List;

class Problem1 {

    public static final int LAST_PAGE = 400;
    public static final int FIRST_PAGE = 1;
    public static final int EXCEPTION = -1;
    public static final int SIZE = 2;
    public static final int LEFT_PAGE_INDEX = 0;
    public static final int RIGHT_PAGE_INDEX = 1;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer;

        if (validate(pobi, crong) != 0) {
            return EXCEPTION;
        }

        int maxPobi = getMax(pobi);
        int maxCrong = getMax(crong);
        answer = compare(maxPobi, maxCrong);

        return answer;
    }

    public static int validate(final List<Integer> pobi, final List<Integer> crong) {
        int pobiLeftPage = pobi.get(LEFT_PAGE_INDEX);
        int pobiRightPage = pobi.get(RIGHT_PAGE_INDEX);
        int crongLeftPage = crong.get(LEFT_PAGE_INDEX);
        int crongRightPage = crong.get(RIGHT_PAGE_INDEX);

        if ((pobiRightPage - pobiLeftPage) != 1 || (crongRightPage - crongLeftPage) != 1) {
            return EXCEPTION;
        }
        if ((pobiLeftPage % 2 != 1) || (pobiRightPage % 2 != 0)
                || (crongLeftPage % 2 != 1) || (crongRightPage % 2 != 0)) {
            return EXCEPTION;
        }
        if ((pobiLeftPage == FIRST_PAGE) || (pobiRightPage == LAST_PAGE)
                || (crongLeftPage == FIRST_PAGE) || (crongRightPage == LAST_PAGE)) {
            return EXCEPTION;
        }
        if (pobi.size() != SIZE || crong.size() != SIZE) {
            return EXCEPTION;
        }
        return 0;
    }

    public static int compare(final int pobi, final int crong) {
        if (pobi > crong) {
            return 1;
        }
        if (pobi < crong) {
            return 2;
        }
        return 0;
    }

    public static int getMax(final List<Integer> player) {
        int maxLeft = getMaxSumOrMul(player.get(0));
        int maxRight = getMaxSumOrMul(player.get(0));
        return Math.max(maxLeft, maxRight);
    }

    public static int getMaxSumOrMul(final int page) {
        int sumPage = getSumPage(page);
        int multiplyPage = getMultiplyPage(page);
        return Math.max(sumPage, multiplyPage);
    }

    public static int getSumPage(final int page) {
        String stringPage = String.valueOf(page);
        int sum = 0;
        for (int i = 0; i < stringPage.length(); i++) {
            sum += stringPage.charAt(i) - '0';
        }
        return sum;
    }

    public static int getMultiplyPage(final int page) {
        String stringPage = String.valueOf(page);
        int mul = 1;
        for (int i = 0; i < stringPage.length(); i++) {
            mul *= stringPage.charAt(i) - '0';
        }
        return mul;
    }
}
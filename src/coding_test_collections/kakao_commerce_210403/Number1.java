package coding_test_collections.kakao_commerce_210403;

public class Number1 {
    public static void main(String[] args) {
        int[] h = {4,5,3,2,1};
        int[] w = {2,4,4,5,1};

        int solution = solution(h, w);
        System.out.println(solution);
    }

    private static int solution(int[] gift_cards, int[] wants) {

        int result = 0;
        int temp;

        for (int i = 0; i < gift_cards.length; i++) {
            for (int j = i + 1; j < wants.length; j++) {
                if (wants[i] == gift_cards[j] && wants[j] != gift_cards[j]) {
                    temp = gift_cards[i];
                    gift_cards[i] = gift_cards[j];
                    gift_cards[j] = temp;
                }
            }
        }

        for (int i = gift_cards.length - 1; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                if (wants[i] == gift_cards[j] && wants[j] != gift_cards[j]) {
                    temp = gift_cards[i];
                    gift_cards[i] = gift_cards[j];
                    gift_cards[j] = temp;
                }
            }
        }

        for (int i = 0; i < gift_cards.length; i++) {
            if (wants[i] != gift_cards[i]) result++;
        }
        return result;
    }
}

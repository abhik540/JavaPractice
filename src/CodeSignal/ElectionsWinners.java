package CodeSignal;

import java.util.Arrays;

public class ElectionsWinners {

    public static void main(String[] args) {
        // System.out.println(solution(new int[]{2, 3, 5, 2}, 3));
        System.out.println(solution(new int[]{1, 3, 3, 1, 1}, 0));

    }

    static int solution(int[] votes, int k) {
        int max = Arrays.stream(votes).max().getAsInt();

        if(Arrays.stream(votes).filter(i -> i == max).toArray().length >= 2 && k==0){
            return 0;
        }

        int result = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] + k > max || votes[i] == max) {
                result++;
            }
        }
        return result;

    }
}

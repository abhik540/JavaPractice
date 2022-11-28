package CodeSignal;

public class FIndDepositProfit {

    public static void main(String[] args) {
        System.out.println(solution(100, 20, 170));
    }

    static int solution(int deposit, int rate, int threshold) {

        double depositDouble = deposit;
        double thresholdDouble = threshold;
        double rateDouble = rate;
        double percentage = rateDouble / 100;
        int year = 0;
        while (depositDouble < thresholdDouble) {
            depositDouble += (depositDouble * percentage);
            year++;
        }

        return year;

    }
}

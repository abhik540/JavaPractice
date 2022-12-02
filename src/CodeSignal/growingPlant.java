package CodeSignal;

public class growingPlant {

    public static void main(String[] args) {
        System.out.println(solution(10,9, 4));
    }

    static int solution(int upSpeed, int downSpeed, int desiredHeight)
    {
        int Height = upSpeed;
        int days = 1;

        while (Height < desiredHeight)
        {
            Height -= downSpeed;
            Height += upSpeed;

            days++;
        }

        return days;
    }
}

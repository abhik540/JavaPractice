package CodeSignal;

public class digitDegree {

    int solution(int n) {

        String str = n + "";
        int temporary_sum = 0, count = 0;

        while (str.length() > 1)
        {
            temporary_sum = 0;

            // computing sum of its digits
            for (int i = 0; i < str.length(); i++)
                temporary_sum += ( str.charAt(i) - '0' ) ;

            // converting temporary_sum into string
            // str again .
            str = temporary_sum + "" ;

            // increase the count
            count++;
        }

        return count;

    }
}

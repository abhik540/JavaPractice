package COne;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class test {


    public static void main(String[] args) {

        int threeMonthTotalStatement  = 0;
        int totalPaymentCount = Integer.sum(10 , 20);
        BigDecimal.valueOf(totalPaymentCount).divide(BigDecimal.valueOf(threeMonthTotalStatement),2, RoundingMode.HALF_DOWN);
    }
}

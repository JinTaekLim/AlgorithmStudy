package week009.day3;

import java.math.BigInteger;

public class HYB_03 {
    public int solution(String number) {
        int answer = 0;
        BigInteger bigNumber = new BigInteger(number);

        bigNumber=bigNumber.remainder(BigInteger.valueOf(9));

        return bigNumber.intValue();
    }


}

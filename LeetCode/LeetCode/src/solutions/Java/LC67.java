package solutions.Java;

import java.math.BigInteger;

public class LC67 {

    public String addBinary(String a, String b) {

        BigInteger aBinary = new BigInteger(a,2);
        BigInteger bBinary = new BigInteger(b,2);

        BigInteger sum = aBinary.add(bBinary);

        return sum.toString(2);

    }

}

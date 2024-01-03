package solutions.Java;

public class LC191 {

    public int hammingWeight(int n) {

        /*long value = n;
        int countOnes = 0;
        String convertedValue = Long.toBinaryString(value);

        for(int i = 0; i < convertedValue.length(); i++){
            if(convertedValue.charAt(i) == '1') countOnes++;
        }

        return countOnes;*/

        return Integer.bitCount(n);

    }


}

package solutions.Java;

public class LC9 {

    public boolean isPalindrome(int x) {

        String number = Integer.toString(x);
        String reversedNumber = new StringBuilder(number).reverse().toString();

        if(number.equals(reversedNumber)) return true;
        return false;

    }

}

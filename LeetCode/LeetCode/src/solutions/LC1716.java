package solutions;

public class LC1716 {

    public int totalMoney(int n){

        int total = 0;
        int initialValue = 1;
        int week = 0;
        int calc = initialValue;

        for (int i = 0; i < n; i++){
            if(week == 7){
                week = 0;
                initialValue++;
                calc = initialValue;
            }
            total += calc;
            week++;
            calc++;
        }

        return total;
    }

}
package solutions.Java;

public class LC1630 {

    private int big, medium, small;

    public LC1630(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {

        if(carType == 1 && big != 0){
            big--;
            return true;
        }
        else if(carType == 2 && medium != 0){
            medium--;
            return true;
        }
        else if(carType == 3 && small != 0){
            small--;
            return true;
        }

        else return false;

    }

}
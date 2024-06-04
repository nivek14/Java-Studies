package solutions.Java;

public class LC605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean response = true;

        if (flowerbed.length == 1){
            if (flowerbed[0] == 1 && n > 0) response = false;
            else response = true;
        }

        else {
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < flowerbed.length; j++) {
                    if((j-1) < 0){
                        if (flowerbed[j] == 0 && flowerbed[j+1] == 0){
                            flowerbed[j] = 1;
                            response = true;
                            break;
                        }
                    }
                    else if((j+1) >= flowerbed.length){
                        if (flowerbed[j] == 0 && flowerbed[j-1] == 0){
                            flowerbed[j] = 1;
                            response = true;
                            break;
                        }
                    }
                    else if (flowerbed[j] == 0 && flowerbed[j-1] == 0 && flowerbed[j+1] == 0){
                        flowerbed[j] = 1;
                        response = true;
                        break;
                    }
                    response = false;
                }
            }
        }

        return response;

    }

}

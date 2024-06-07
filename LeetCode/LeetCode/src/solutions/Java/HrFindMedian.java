package solutions.Java;


import java.util.Collections;
import java.util.List;

public class HrFindMedian {

    public int FindMedian(List<Integer> arr){
        Collections.sort(arr);
        int median;
        if(arr.size() % 2 == 0) median = (arr.get(arr.size()/2)) + (arr.get((arr.size()/2) - 1) / 2);
        else median = arr.get((arr.size() - 1) / 2);
        return median;
    }
    
}

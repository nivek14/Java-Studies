package solutions.Java;

import java.util.Arrays;

public class LC88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums1.length == 0 || m == 0) nums1 = nums2;

        else if(nums2.length == 0 || n == 0){
            int[] aux = new int[m];
            for(int i = 0; i < m; i++){
                aux[i] = nums1[i];
            }
            nums1 = aux;
        }

        else{
            for(int i = 0; i < nums2.length; i++){
                for(int j = 0; j < nums1.length; j++) {
                    if (nums1[j] == 0) {
                        nums1[j] = nums2[i];
                        break;
                    }
                }
            }
        }

        Arrays.sort(nums1, 0, nums1.length);

        System.out.println(Arrays.toString(nums1));

    }

}

package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sapt2 {
    //todo:3512:You are given an integer array nums and an integer k.
    // You can perform the following operation any number of times:

    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int nrOperatii = sum % k;
        return nrOperatii;

    }
    //todo:3825: A mountain is called stable if the mountain just before it (if it exists) has a height strictly greater than threshold. Note that mountain 0 is not stable.
    //
    //Return an array containing the indices of all stable mountains in any order.

    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> munti = new ArrayList<>();
        for (int i = 2; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                munti.add(i);
            }

        }
        return munti;

    }
    //todo:3065: n one operation, you can remove one occurrence of the smallest element of nums.
    //
    //Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.

    public int minOperations2(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k) {
                cnt++;
            }
        }
        return cnt;
    }
    //todo:1662  verifica daca cele 2 stringuri sunt echivalente

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String cuvant1="";
        String cuvant2="";
        for(int i=0;i< word1.length;i++){
            cuvant1+=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            cuvant2+=word2[i];
        }
        if(cuvant1.equals(cuvant2)){
            return true;
        }
        return false;

    }
    //todo:2037 Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.
    //
    //Note that there may be multiple seats or students in the same position at the beginning.

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<seats.length;i++){
            sum+=Math.abs(seats[i]-students[i]);
        }
        return sum;


    }
    //todo:3264
    //todo:ou are given an integer array nums, an integer k, and an integer multiplier.
    //
    //You need to perform k operations on nums. In each operation:
    //
    //Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
    //Replace the selected minimum value x with x * multiplier.
    //Return an integer array denoting the final state of nums after performing all k operations.



    public int[] getFinalState(int[] nums, int k, int multiplier) {
            for (int cnt = 0; cnt < k; cnt++) {
                int min = Integer.MAX_VALUE;
                int minIndex = -1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] < min) {
                        min = nums[i];
                        minIndex = i;
                    }
                }
                nums[minIndex] *= multiplier;
            }
            return nums;
        }
        //todo:2418: sort the people

    public String[] sortPeople(String[] names, int[] heights) {
       for(int i=0;i<heights.length;i++){
           for(int j=0;j<heights.length-i-1;j++){
               if(heights[j]<heights[j+1]) {
                   int temp=heights[j];
                   heights[j]=heights[j+1];
                   heights[j+1]=temp;
                   String tempname=names[j];
                   names[j]=names[j+1];
                   names[j+1]=tempname;

               }

           }

       }

       return names;



    }









}





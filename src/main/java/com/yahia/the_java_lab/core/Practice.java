package com.yahia.the_java_lab.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

    //three sum
    public List<List<Integer>> threeSum(int[] nums){
        //create an array list for holding the result
        List<List<Integer>> result = new ArrayList<>();
        //hold the size of the input
        int n = nums.length;

        //sort the array to minimize the number of loops
        Arrays.sort(nums);

        //iterate through the array to start for the current
        for ( int i = 0; i < n - 2; i++){
            //remove duplicates in the current value
            if( i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            //check the smallest element >0, break
            if(nums[i] > 0){
                break;
            }
            //check the sum of smallest > 0, break
            if (nums[i] + nums[i + 1] + nums[i+2] > 0) {
                break;
            }
            //check the sum of larget possible is < 0, break
            if ( nums[i] + nums[n - 2] + nums[n - 1] < 0){
                continue;
            }

            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if( sum == 0){
                    result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));

                    //remove left duplicates
                    int leftVal = nums[left];
                    while (left < right && nums[left] == leftVal){
                        left++;
                    }

                    //remove right duplicates
                    int rightVal = nums[right];
                    while (left < right && nums[right] == rightVal){
                        right--;
                    }


                } else if (sum < 0) {
                    left++;
                }else {
                   right--;
                }


            }
        }

        return result;

    }
}

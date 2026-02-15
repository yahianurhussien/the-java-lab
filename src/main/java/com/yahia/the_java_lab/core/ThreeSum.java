package com.yahia.the_java_lab.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

//    Step 1: Sort the array
//    Step 2: Fix one element (i)
//    Step 3: Use two pointers (left, right) to find complement
//    Step 4: Handle duplicates carefully
//    Step 5: Adjust pointers based on sum comparison

    private static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // step1: sort the array
        int n = nums.length;


        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) { // removing the duplicates
                continue;
            }

            //optimization 1 : if smollest element > 0, break
            if (nums[i] > 0) {
                break;
            }

            //optimization 2 : if the smallest three > 0, break
            if (nums[i] + nums[i + 1] + nums[i + 2] > 0) {
                break;
            }

            //optimization 3: if the sum of the current and the largest two <, continue

            if (nums[i] + nums[n - 2] + nums[n - 1] < 0) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //remove duplicates for left
                    int leftVal = nums[left];
                    while (left < right && nums[left] == leftVal) {
                        left++;
                    }

                    //remove duplicates for right
                    int rightVal = nums[right];
                    while (left < right && nums[right] == rightVal) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }


            }


        }
       return result;
    }
        public static void main (String[]args){
         char b = 555;
            System.out.println(b);


             Practice practice = new Practice();
            // Test cases
            int[] nums1 = {-1, 0, 1, 2, -1, -4};
            System.out.println("Test 1: " + practice.threeSum(nums1));
            // Expected: [[-1,-1,2],[-1,0,1]]

            int[] nums2 = {0, 1, 1};
            System.out.println("Test 2: " + practice.threeSum(nums2));
            // Expected: []

            int[] nums3 = {0, 0, 0};
            System.out.println("Test 3: " + practice.threeSum(nums3));
            // Expected: [[0,0,0]]

            int[] nums4 = {-2, 0, 1, 1, 2};
            System.out.println("Test 4: " + practice.threeSum(nums4));
            // Expected: [[-2,0,2],[-2,1,1]]

        }


}


package Recursion;

import java.util.ArrayList;

public class RecursionEight {

    static ArrayList<Integer> nums = new ArrayList<>();

    static void Linear(int[] arr , int target , int index){
        if(index == arr.length){
            return;
        }
        else if(arr[index] == target){
            nums.add(index);
        }

        Linear(arr, target , index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2, 2,3,2,2};

        Linear(arr , 2 , 0);
        System.out.println(nums);
    }
}
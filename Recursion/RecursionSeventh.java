package Recursion;

public class RecursionSeventh {
    static int Linear(int[] arr , int target , int index){
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;

        return Linear(arr, target, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {12,13,43,532,2345};

        int result = Linear(arr, 43, 0);

        System.out.println(result);
    }
}

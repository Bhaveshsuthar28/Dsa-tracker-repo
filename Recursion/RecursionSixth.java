package Recursion;

public class RecursionSixth {
    static boolean Sorting(int[] arr , int index){
        if(index == arr.length - 1){
            return true;
        }

        return arr[index] < arr[index + 1] && Sorting(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6 , 9 , 0};

        boolean result = Sorting(arr, 0);

        System.out.println(result);
    }
}

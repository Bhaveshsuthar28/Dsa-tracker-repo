package BInarySearch;

public class Celling {
    static int celling(int[] arr , int target){
        int start = 0 , end = arr.length -1 , ans = -1;

        if(target > arr[end]) return ans;

        while(start <= end){
            int mid = (start + (end-start))/2;

            if(target == arr[mid]){
                return arr[mid];
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                ans = arr[mid];
                end = mid-1;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int result = celling(arr,3);

        if(result == -1){
            System.out.println("Not exist");
        }
        else{
            System.out.println("Answer is " + result);
        }
    }
}

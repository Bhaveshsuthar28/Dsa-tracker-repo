package Array;
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target : ");
        int target = sc.nextInt();

        int result = findByOne(arr, target);

        if(target == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at position no " + result);
        }
        sc.close();
    }

    static int findByOne(int[] arr , int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

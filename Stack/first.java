package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class first {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();

        arr.push(12);
        arr.push(13);
        arr.push(14);
        arr.push(15);
        arr.push(16);
        arr.push(17);


        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());

        System.out.println();

        Queue<Integer> nums = new LinkedList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums.remove());
        System.out.println(nums.remove());
        System.out.println(nums.remove());
        System.out.println(nums.remove());
    }
}

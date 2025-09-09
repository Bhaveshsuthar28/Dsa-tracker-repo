package Recursion;

public class RecursionThird {
    static String ReverseString(String str){
        if(str == null || str.length() <= 1) return str;

        return ReverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Bhavesh";
        String result = ReverseString(str);

        System.out.println(result);
    }
}

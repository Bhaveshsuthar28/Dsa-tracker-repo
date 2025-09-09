package Array;

import java.util.Scanner;

public class Array6 {
    static int findString(String[] str , String target){
        for(int i=0; i<str.length; i++){
            if(str[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] str = {"Bhavesh" , "Suthar" , "Kumar"};

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int result = findString(str, n);

        if(result == -1){
            System.out.println("not found");
        }
        else{
            System.err.println("Found at index no " + result);
        }
        sc.close();
    }
}

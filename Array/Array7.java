package Array;

import java.util.Scanner;

public class Array7 {

    static int HowMuch(String[] str , String ch){
        int count = 0;
        for(String arr : str){
            for(int i=0; i<arr.length(); i++){
                if(arr.substring(i , i+ch.length()).equals(ch)){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String[] str = {"Bhavesh" , "Suthar" , "Kumar"};

        System.out.print("What would you find which how many time appear : ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int result = HowMuch(str, n);

        if(result == 0){
            System.out.println("not found");
        }
        else{
            System.err.println(n + " appear " + result + " times");
        }

        sc.close();
    }
}

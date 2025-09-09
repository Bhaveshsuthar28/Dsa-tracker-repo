package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //Array in java
        //Syntax
        //Datatype[] variable = new Datatype[size];

        int[] marks = new int[5];
        marks[0] = 22;

        // int[] age; // its is a declaretion which is currently stored in stack because 
        //int [] age = new int[5] //now its is a treat like a object so its will store inn heap of 5 block code

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] age = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + " element : ");
            age[i] = sc.nextInt();
        }

        //for each loops 
        // for(Datatype variable(which take place of each element) : Array_Name){
        //     System.out.println(variable);
        // }

        System.out.println(Arrays.toString(age));
        System.out.println(age[0]);
        
        sc.close();
    }
}

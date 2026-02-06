package array;

import java.util.Arrays;

public class javacloning {
    public static void main(){
    int arr [] = {1,2,3,4,5};
//        int [] dup = arr;
//
//        arr[0] = 10;
//        System.out.println(dup[0]);

    int[] clon = arr.clone();
    clon[0] = 20;
    System.out.println("Cloned Array : \n"+ Arrays.toString(clon));
    System.out.println(arr[0]);
}}

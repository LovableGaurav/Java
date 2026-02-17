package JAVA_TEST_3;

import java.util.Scanner;

public class MaxMin {


    public static void findmaxmin(int [] nums){

        if(nums.length ==0){
            System.out.println("Array is Empty");
        }
        int min = nums[0];
        int max=  nums[0];

        for(int i =0;i<nums.length-1;i++){
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Min : " + min+ "Max : "+ max);

    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n= sc.nextInt();
        int[] nums = new int[n];
        for(int i =0 ;i<n;i++){
             nums[i] = sc.nextInt();
        }
        findmaxmin(nums);
    }

}

package DSA;

import java.util.HashMap;

public class TwoSum {
    public static void main() {
        int [] arr = {2,7,11,15};
        int target = 9;
        int[] result = new TwoSum().twosum(arr, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    int [] twosum (int [] arr , int target){
//        for(int i =0;i< arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                if(arr[i] + arr[j] == target){
//                    return new int[]{i,j};

        // Using HashMap ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int diff = target-arr[i];

            if(map.containsKey(diff)){
              return new int []  {map.get(diff),i};

        }
        map.put(arr[i],i);
//        return new int[0];
    }
        return new int[0];
}}

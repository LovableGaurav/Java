package set;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetExample {
    public static void main() {
        List<Integer> nums =List.of(56,98,98,56,34,90,45,12,78);
        ArrayList<Integer> list = new ArrayList<>();

//        for(int num : nums){
//            if(!list.contains(nums)){
//                list.add(num);
//            }
//        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        System.out.println(set);
//        Set<Integer> collect = nums.stream().collect(Collectors.toSet());
//    System.out.println(collect);

        //Searching the Number
        System.out.println(set.contains(5));

        TreeSet<Integer> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);

        LinkedHashSet<Integer> orderset = new LinkedHashSet<>(set);
        System.out.println(orderset);
    }
}

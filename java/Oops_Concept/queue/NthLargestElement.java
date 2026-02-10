package queue;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class NthLargestElement {
    public  static void main() {
        List<Integer> nums = List.of(45,46,3,6368,13,17,56,90,34,56,45);
        int n= 4;
        HashSet<Integer> set = new HashSet<>(nums);
        if(set.size() < n){
            System.out.println("Invalid Input");
            return ;
        } else{
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            pq.addAll(set);

            for(int i =1;i<=n-1;i++){
                pq.poll(); // it pop the the 1st element  // for MinHeap  it will be the smallest
                // for the Max Heap it will be the Largest element
            }
            System.out.println(n + " Largest element in the List :  "+ pq.peek());
        }
    }
}

package array;

import java.lang.reflect.Array;

public class PassbyvalurAndRef {

    public  void main(String[] args) {

        int arr[] = {23, 345, 45, 54, 45, 50};
        int n = 20;

//        System.out.println(Array.toString(arr));
        new PassbyvalurAndRef().compute(n, arr);
        System.out.println(n);
        System.out.println(arr[0]);
    }

    void compute(int n, int[] arr) {
        n = 100;
        arr[0] = -1;
//        System.out.println(arr);
    }
}

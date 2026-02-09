package array;

import java.util.Arrays;

public class varargs {
    public static void main(String ... Gaurav){
        System.out.println(Gaurav.length);
        new varargs().callme("hey" , 3,7,52,4);

    }
//    private void callme(int x, int y){
//
//    }
    private void callme(String str ,int ... x){  //valuable arguments
        System.out.println(x.length);
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
}

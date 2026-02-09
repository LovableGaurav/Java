package Question;

import java.util.Scanner;

public class SecondHiggestNumberInArray {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = Scan.nextInt();

        int [] arr = new int[num];
        System.out.println("Enter the array");
        for(int i=0;i<num;i++){
            arr[i] = Scan.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int sencondlargets = Integer.MIN_VALUE;
        for(int i =0;i<num;i++){
            if(arr[i]>largest){
                sencondlargets = largest;
                largest=arr[i];
            }else if(arr[i]> sencondlargets && arr[i] != largest){
                 sencondlargets = arr[i];
            }
        }
        System.out.println(sencondlargets);
    }
}

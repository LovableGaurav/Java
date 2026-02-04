package Question;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }

        sc.close();


    }
    public static boolean isArmstrong(int num){
        int n = (num ==0 ) ? 1 : (int)Math.log10(num)+1;
        int temp = num;
        int sum = 0;
        while(temp>0){
            int digit = temp %10;
            sum += Math.pow(digit,n);
            temp/= 10;
//            n--;
        }
        return sum == num;
    }
}

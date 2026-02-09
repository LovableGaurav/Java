package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main( ){
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int [] arr = {23, 45, 78, 90};
        try{
            System.out.println(10 / arr[num]);          // Because here num sized is not declared like
            // it can be negative and out of array index
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | InputMismatchException  e) {     // Exception it will Run Time error
            System.out.println("exception Occured");
            e.printStackTrace();
        }catch (Exception e){       // Always put at the end
            System.out.println("exception Occured");
            e.printStackTrace();
        }
        scanner.close();
}}

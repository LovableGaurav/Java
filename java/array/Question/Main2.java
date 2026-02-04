package Question;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Start");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] arr = {23, 45, 78, 90};

        try {
            System.out.println(10 / arr[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }

        scanner.close();
    }
}

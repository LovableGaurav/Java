package Strings;

import java.util.Scanner;

public class Input{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1. Take the first input (n)
            System.out.print("Enter the number of integers (n): ");
            int n = sc.nextInt();

            // 2. Consume the leftover newline character

            String s =" ";
           for(int i =1;i<n;i++){
                s = sc.next();

           }
            System.out.println(s);

            sc.close();
        }
    }


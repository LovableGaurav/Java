package Exception;

import java.util.Scanner;

public class ClassTest {
    public static void main(){
        int marks = new Scanner(System.in).nextInt();
        System.out.println(marks);
        try {
            checkGrade(marks);
        } catch (LowMarksException e){
            throw new RuntimeException(e);
        }
    }
    private static void checkGrade(int marks) throws LowMarksException{
        if(marks <60 && marks >=30){
            throw new LowMarksException("Need Improvement");
        }else if(marks<30){
            throw new LowMarksException("Extremly poor Marks ");
        }
    } }
    class LowMarksException extends Exception{
        public LowMarksException(String message){
            super(message);
        }
    }



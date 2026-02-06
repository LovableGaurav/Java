package JavaTest.Oops2;

import static JavaTest.Oops2.Student.MAX_MARKS;
import static JavaTest.Oops2.Student.collegeName;

public class Main {

        public static class PercentageCalculation{
            public static void main(String[] args) {
                Student s1 = new Student("Rahul", 87);
                Student s2 = new Student("Ananya", 92);
                s1.printPercentage();
                s2.printPercentage();
                System.out.println("College name for all students: " + collegeName);
                System.out.println("Maximum Marks: " + MAX_MARKS);
            }}}


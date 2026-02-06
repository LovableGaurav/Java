package array;

import java.util.Arrays;

public class ArrayOfobects extends Student {
    public ArrayOfobects(int id, String name) {
        super(id, name);
    }

    public static void main(String[] args) {

        String[] arr = {"Suman", "Mandeep", "Soujanya", "Adarsh"};
        String[] strArr = new String[5];

//        System.out.println(arr);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(strArr));

        Student[] students = {

                new Student(3,"Johnny"),
                new Student(1,"Mandeep"),
                new Student(2,"Soujanya"),
                new Student(4,"Adarsh")
        };
        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

//        students.info();

    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
    public String info() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

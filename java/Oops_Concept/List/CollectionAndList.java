package List;

import encapsulation.student;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAndList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(){{
            add(34);
            add(31);
            add(90);
            add(67);
        }};
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>(list);
//        Collections.copy(list1,list);
        System.out.println(list);
        System.out.println(list1);

        list.replaceAll(x-> x*2 );
        System.out.println(list);

        ArrayList<Student> ListofStudents = new ArrayList<>();
        ListofStudents.add(new Student("Gaurav",56));
        ListofStudents.add(new Student("Rohan",25));
        ListofStudents.add(new Student("Aadarsh",45));
        ListofStudents.add(new Student("Abhishek",16));
//        System.out.println(ListofStudents.toString());
        ListofStudents.sort((s1, s2) -> Integer.compare(s1.age, s2.age));
        for( Student s :ListofStudents){
            System.out.println(s);
        }
    }

}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

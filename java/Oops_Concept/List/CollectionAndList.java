package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionAndList {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(){{
//            add(34);
//            add(31);
//            add(90);
//            add(67);
//        }};
//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.reverse(list);
//        System.out.println(list);
//
//        Collections.shuffle(list);
//        System.out.println(list);
//
//        ArrayList<Integer> list1 = new ArrayList<>(list);
////        Collections.copy(list1,list);
//        System.out.println(list);
//        System.out.println(list1);
//
//        list.replaceAll(x-> x*2 );
//        System.out.println(list);

        ArrayList<Student> ListofStudents = new ArrayList<>();
        ListofStudents.add(new Student("Gaurav",56));
        ListofStudents.add(new Student("Rohan",25));
        ListofStudents.add(new Student("Aadarsh",45));
        ListofStudents.add(new Student("Abhishek",16));

        // Using Comparator Implements
        Collections.sort(ListofStudents);
        ListofStudents.stream().forEach(System.out ::println);


// Using lamda fn
//        Collections.sort((st1,st2) -> st1.name.compareTo(st2.name));


//        Collections.sort(ListofStudents, new NameComaparator());
//        System.out.println();
//        ListofStudents.stream().forEach(System.out ::println);

        // using comparing
        Collections.sort(ListofStudents,
                Comparator.comparing(st -> st.name));
        System.out.println();
        ListofStudents.stream().forEach((System.out ::println));
    }

}

class Student implements  Comparable<Student>{
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

    @Override
    public int compareTo(Student st1) {

        if(st1.age == this.age) {
            return 0;
        } else  if(st1.age > this.age){
            return 1;
        }else {
            return -1;
        }
}}

class NameComaparator implements Comparator <Student>{

    @Override
    public int compare(Student st1, Student st2) {
        return -st1.name.compareTo(st2.name);
    }
}
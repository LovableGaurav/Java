package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListExample {
    public static void main(String[] args) {
        int [] nums={56,45,827,99};

//        All the collection accepts only object type
        ArrayList  list =new ArrayList();
        list.add(56);
        list.add("Gaurav");
        list.add(8.3);
        list.add(true);
        System.out.println(list);
//        System.out.println(nums);

        ArrayList<Integer> listofNums = new ArrayList<>();
        listofNums.add(58);
//        listofNums.add("Rohan");
        listofNums.add(67);
        listofNums.add(6348);

        listofNums.add(3839);

        listofNums.add(69);


        System.out.println(listofNums);
        listofNums.remove(0);  // Here we enter index not element
        listofNums.add(null);
        listofNums.set(2,68);
        System.out.println(listofNums);
        for(int i=0;i<listofNums.size();i++){
            System.out.print(listofNums.get(i) +"");
        }

        System.out.println();
//
//        for each
    for(Integer num : listofNums){
//        listofNums.add(11);         // collection can't modilfy during iterating
        System.out.println(num +" " );
    }

//        Assignment
//                -> on Looping from last to first in listofNums

        Iterator<Integer> iterator =listofNums.iterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next() + " ");
    }
        System.out.println("Removing last");

    listofNums.removeLast();
        System.out.println("Filtering of even");

    listofNums.stream().filter(x-> x % 2 == 0).forEach(System.out::println);
    if(listofNums.isEmpty()){
        System.out.println("Empty");
    }
        System.out.println("At zero index");
        System.out.println(listofNums.get(0));
        System.out.println("From Start to end ");
        System.out.println(listofNums.get(listofNums.size()-1));
        System.out.println("Get 1st element");
        System.out.println(listofNums.getFirst());
        System.out.println("last element");
        System.out.println(listofNums.getLast());

        List<Integer> List2 = List.of(676,738,293,012);
//        List2.add(2);
        listofNums.addAll(List2); // TODO See how you can merge two list
        System.out.println(listofNums);
        listofNums.clear();
}}

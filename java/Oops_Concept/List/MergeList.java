package List;
import java.util.*;
import java.util.stream.*;
public class MergeList {
        public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
            List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

            // Filter elements in list2 that are NOT in list1
            List<Integer> filteredList2 = list2.stream()
                    .filter(element -> !list1.contains(element))
                    .collect(Collectors.toList());

            // Merge the filtered elements into list1
            list1.addAll(filteredList2);

            System.out.println("True Merged List: " + list1);
            // Output: [1, 2, 3, 4, 5, 6]

    }
}

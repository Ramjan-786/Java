//Example : LinkedHashSet and Streams

package sets.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
       System.out.println(set);
        // Use streams to filter elements that contain 'a' and collect them into a new LinkedHashSet
        LinkedHashSet<String> filteredSet = set.stream()
            .filter(s -> s.contains("a"))
            .collect(Collectors.toCollection(LinkedHashSet::new));

        // Print the filtered LinkedHashSet
        System.out.println("Filtered LinkedHashSet: " + filteredSet);
    }
}

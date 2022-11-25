package Amazon;

import java.util.*;
import java.util.stream.Collectors;

public class test4_1 {

    public static void main(String[] args) {
        List<Pair> pairs = Arrays.asList(new Pair("Item1", "Item2"),
                new Pair("Item3", "Item4"),
                new Pair("Item4", "Item5"),
                new Pair("Item5", "Item6"),
                new Pair("Item7", "Item8"));

        Set<Pair> reservedDuplicateContainsPair = new HashSet<>();
        int i = 0;

        while (i < pairs.size()) {
            for (Pair self : pairs) {
                if (self.equals(pairs.get(i))) {
                    continue;
                }
                if (self.item1.equals(pairs.get(i).item1)
                        || self.item1.equals(pairs.get(i).item2)
                        || self.item2.equals(pairs.get(i).item1)
                        || self.item2.equals(pairs.get(i).item2)) {
                    reservedDuplicateContainsPair.add(pairs.get(i));
                }
            }

            i = i + 1;
        }
        Set<String> result = new HashSet<>();
        for (Pair pair : reservedDuplicateContainsPair) {
            result.add(pair.item1);
            result.add(pair.item2);
        }
        Set<String> finalResult = result.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(finalResult);
    }


    static class Pair {
        String item1;
        String item2;

        Pair(String item1, String item2) {
            this.item1 = item1;
            this.item2 = item2;
        }
    }


}
package CodeSignal;

import java.util.*;
import java.util.stream.Collectors;

public class FileNaming {

    public static void main(String[] args) {
        //System.out.println(solution(new String[]{"doc", "doc", "image", "doc(1)", "doc"}));


        System.out.println(solution(new String[]{
                "dd",
                "dd(1)",
                "dd(2)",
                "dd",
                "dd(1)",
                "dd(1)(2)",
                "dd(1)(1)",
                "dd",
                "dd(1)"
        }));
//        System.out.println(solution(new String[]{
//                "a(1)",
//                "a(6)",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",
//                "a",}));
    }

    static String[] solution(String[] names) {

        List<String> out = new ArrayList<>();
        Map<String, Integer> counterMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            if (i == 0) {
                out.add(names[i]);
                counterMap.put(names[i], 0);
            } else {
                String name = names[i];
                if (counterMap.get(name) != null) {
                    counterMap.put(name, counterMap.get(name) + 1);
                } else {
                    counterMap.put(names[i], 1);
                }
                if (out.contains(name)) {
                    String mapName = name + "(" + counterMap.get(name) + ")";
                    if (out.contains(mapName)) {
                        counterMap.put(name, counterMap.get(name) + 1);
                        out.add(name + "(" + counterMap.get(name) + ")");
                    } else {
                        out.add(mapName);
                    }
                } else {
                    out.add(name);
                }
            }
        }
        return out.stream().toArray(String[]::new);
    }

}

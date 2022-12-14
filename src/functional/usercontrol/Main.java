package src.functional.usercontrol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    List<List<String>> table = new ArrayList<>();
        table.add(Arrays.asList("User1", "User2", "2"));
        table.add(Arrays.asList("User3", "User4", "6"));
        table.add(Arrays.asList("User2", "User4", "14"));
        table.add(Arrays.asList("User4", "User1", "3"));

        Map<String, Integer> mapstring1 = table.stream().collect(Collectors.toMap(s -> { return s.get(0); },
                                                                                  s -> { return -(Integer.parseInt(s.get(2))); },
                                                                                  (s, a) -> { return s + a; }
                                                                                  ));
        
        Map<String, Integer> mapstring2 = table.stream().collect(Collectors.toMap(s -> { return s.get(1); },
                                                                                  s -> { return Integer.parseInt(s.get(2)); },
                                                                                  (s, a) -> { return s + a; }));


        Map<String, Integer> mapstring3 = new HashMap<>(mapstring1);

        mapstring2.forEach((k,v) -> {
            mapstring3.merge(k, v, (old_value, new_value) -> {return old_value + new_value;});
        });

        //Map<String, Integer> result= mapstring3.entrySet().stream().filter(item -> item.getValue() < 0).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        System.out.println(mapstring1);
        System.out.println(mapstring2);
        System.out.println(mapstring3);
        //System.out.println(result);


        System.out.println("---------------------------------------------------");
        Map<String, Integer> resultMap = new HashMap<>();
        table
        .stream()
        .collect(Collectors
                 .toMap( 
                    s -> { return s.get(0); },
                    s -> { return -(Integer.parseInt(s.get(2))); },
                    (s, a) -> { return s + a; },
                    () -> resultMap
                 ));

        table
        .stream()
        .collect(Collectors
                 .toMap(
                    s -> { return s.get(1); },
                    s -> { return Integer.parseInt(s.get(2)); },
                    (s, a) -> { return s + a; },
                    () -> resultMap
                 ));

        System.out.println(resultMap);
}

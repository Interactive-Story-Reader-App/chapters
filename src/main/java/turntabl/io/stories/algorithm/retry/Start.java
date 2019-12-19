package turntabl.io.stories.algorithm.retry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Start {

    public static void main(String[] args){
        List<String> ch1 = Arrays.asList("1");
        List<String> ch2 = Arrays.asList("1", "2");
        List<String> ch3 = Arrays.asList("1", "3");
        List<String> ch4 = Arrays.asList("2", "3", "4");
        List<String> ch5 = Arrays.asList("4", "5");
        List<String> ch6 = Arrays.asList("4", "5", "6");
        List<String> ch7 = Arrays.asList("6", "7");

        int loopCount = 0;
        int count = 0;

        List<String> candidates = new ArrayList<>();
        List<String> path = new ArrayList<>();

        List<List<String>> en = Arrays.asList(ch1, ch2, ch3, ch4, ch5, ch6, ch7);
        System.out.println(en);
            while(count < en.size()){
                if(loopCount == 0){
                    for (List<String> c: en){
                        if (c.size() == 1 ){
                            candidates.add(c.get(0));
                        }
                    }
                    Collections.shuffle(candidates);

                    path.addAll(candidates);

                    candidates.clear();
                    loopCount += 1;
                }else{
                    for (List<String> a: en){
                        if(a.size() != 1) {
                            List<String> mini = a.subList(0, (a.size() - 1));
                            if (path.containsAll(mini)) {
                                candidates.add(a.get(a.size() - 1));
                            }
                        }
                    }

                    Collections.shuffle(candidates);
                    path.addAll(candidates);
                    candidates.clear();
                }
                count += 1;
            }

        List<String> actualPath = path.stream().distinct().collect(Collectors.toList());
        System.out.println(actualPath);
    }

}

package turntabl.io.stories.algorithm;

import turntabl.io.stories.models.Chapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Processing {
    public static List<String> doProcessing(List<Chapter> chapters) {
        List<String> path = new ArrayList<>();
        List<List<String>> depChapters = new ArrayList<>();

        System.out.println(chapters);

        for(Chapter c : chapters){
            depChapters.add(Logic.finalList(Arrays.asList(c.getCandidates())));
        }

        System.out.println(depChapters);

        for (List<String> arr : depChapters) {
            for (String a : arr) {
                path.add(a);
            }
        }
        System.out.println("====================================");
        System.out.println(path);

        List<String> actualPath = path.stream().distinct().collect(Collectors.toList());
        System.out.println(actualPath);

        return  actualPath;
    }

}

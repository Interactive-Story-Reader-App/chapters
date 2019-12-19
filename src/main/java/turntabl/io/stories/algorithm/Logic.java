package turntabl.io.stories.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {
    public static List<String> finalList(List<String> c){
        List<String> finalList = new ArrayList<>();

        if (c.size() >=1 ) {
            List<String> cSublist = c.subList(0, (c.size() - 1));
            Collections.shuffle(cSublist);
            for (String a : cSublist) {
                finalList.add(a);
            }
            finalList.add(c.get(c.size() - 1));
        }

        return finalList;
    }
}

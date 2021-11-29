package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heights,int height){
        int c=0;
        for (int i :
                heights) {
            if (i >= height){
                c++;
            }
        }
        return c;
    }
}

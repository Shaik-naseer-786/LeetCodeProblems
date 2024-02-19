import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxCandie=0;
            for(int candy : candies){
                maxCandie=Math.max(maxCandie,candy);
            }

            List<Boolean> result=new ArrayList<>();
            for(int candy:candies){
                result.add(candy+extraCandies>=maxCandie);
            }

            return result;
    }
}
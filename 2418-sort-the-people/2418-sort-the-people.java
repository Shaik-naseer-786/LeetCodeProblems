class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int maxIndex=0;
        for(int i=0;i<heights.length;i++){
            maxIndex=i;
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]>heights[maxIndex]){
                    maxIndex=j;
                }
            }
            swap(names,heights,i,maxIndex);
        }
        return names;
    }
    public void swap(String[] names,int[] heights,int i,int j){
        String tempName=names[i];
        names[i]=names[j];
        names[j]=tempName;

        int tempHeight=heights[i];
        heights[i]=heights[j];
        heights[j]=tempHeight;
    }
}
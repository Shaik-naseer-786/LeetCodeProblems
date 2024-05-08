class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=triangle.get(i-1);
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                int sum=prev.get(j-1)+prev.get(j);
                curr.add(sum);
            }
            curr.add(1);
            triangle.add(curr);
        }

        return triangle;
    }
}
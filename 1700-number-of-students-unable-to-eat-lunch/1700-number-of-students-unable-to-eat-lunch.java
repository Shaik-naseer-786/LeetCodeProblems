class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] res=new int[2];
        for(int s:students){
            res[s]++;
        }
        for(int sw:sandwiches){
            if(res[sw]==0){
                break;
            }
            res[sw]--;
        }

        return res[0]+res[1];
    }
}
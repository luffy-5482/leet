class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result =  new ArrayList<>();
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        result.add(firstrow);
        if(numRows==1) return result;
        for(int i =1;i<numRows;i++){
            List<Integer> prevRow = result.get(i-1);

            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for(int j=0;j<i-1;j++){
                nextRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            nextRow.add(1);

            result.add(nextRow);

        }


        return result;
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for (int i=0; i<rowIndex+1; ++i) {
            List<Integer> l = new ArrayList<Integer>();
            for (int j=0; j<i+1; ++j){
                if (j == 0 || j == i) l.add(1);
                else {
                    l.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(l);
        }
        return list.get(rowIndex);
    }
}

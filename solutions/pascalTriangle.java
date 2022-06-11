class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for (int i=0; i<numRows; ++i) {
            List<Integer> l = new ArrayList<Integer>();
            for (int j=0; j<i+1; ++j){
                if (j == 0 || j == i) l.add(1);
                else {
                    l.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(l);
        }
        return list;
    }
}

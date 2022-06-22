class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans= new StringBuilder();
        while(columnNumber>0)
        {
            // A-Z (0-25) while here it starts from A -> 1 to Z -> 26 so --1
            --columnNumber;
            int d= columnNumber%26;
            columnNumber/=26;
            ans.append((char)('A'+d));
        }
        ans.reverse();
        return ans.toString(); 
    }
}

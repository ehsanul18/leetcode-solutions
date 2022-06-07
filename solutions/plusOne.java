class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] == 9) {
            int carry = 1;
            for (int i = digits.length - 1; i >= 0; --i) {
                if (i == 0 && digits[i] == 9 && carry == 1) {
                    int [] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1; 
                    Arrays.fill(newDigits, 1, newDigits.length - 1, 0);
                    return newDigits;
                }
                if (digits[i] == 9) {
                    digits[i] = 0;
                    carry = 1;
                } else {
                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }
        }
        ++digits[digits.length - 1];
        return digits;
    }
}

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftArray = new int[n + 1];
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;

            shiftArray[start] += direction;
            shiftArray[end + 1] -= direction;
        }
        int cumulativeShift = 0;
        char[] result = s.toCharArray();
        for (int i = 0; i < n; i++) {
            cumulativeShift += shiftArray[i];
            int effectiveShift = ((cumulativeShift % 26) + 26) % 26;
            result[i] = (char) ('a' + (result[i] - 'a' + effectiveShift) % 26);
        }
        return new String(result);
    }
}

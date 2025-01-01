class Solution {
    public int maxScore(String s) {
        int currIndex = 0, max = 0, zeros = 0, totalones = 0, currones=0, currmax=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                totalones++;
            }
        }
        while(currIndex<s.length()-1){
            if(s.charAt(currIndex)=='0'){
                zeros++;
            }
            else{
                currones++;
            }
            currmax = zeros + (totalones - currones);
            if(currmax>max){
                max = currmax;
            }
            currIndex++;
        } 
        return max;       
    }
}
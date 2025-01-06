class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        int count=0,s=0;
        for(int i=1;i<n;++i){
            if(boxes.charAt(i-1)=='1'){
                ++count;
            }
            answer[i]=answer[i-1]+count;
        }
        count=0;
        for(int i=n-2;i>=0;--i){
            if(boxes.charAt(i+1)=='1'){
                ++count;
            }
            s +=count;
            answer[i]+=s;
        }
        return answer;
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length()-i-1; j++){
                if(s[(int)j] < s[(int)j+1]){
                    int t = s[(int)j];
                    s[(int)j] = s[(int)j+1];
                    s[(int)j+1] = t;
                    
                }
                answer = s[j];
            }
        }
        return answer;
    }
}
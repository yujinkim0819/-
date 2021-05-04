class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0; //1234567890;
        int[] result = new int[1000];
        
        for(int i=0; i<a.length; i++)
        {
            result[i] = (a[i]*b[i]);
            answer += result[i];
        }
        return answer;
    }
}
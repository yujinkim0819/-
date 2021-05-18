class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0,  sum = 0;
        int n = x;
        
        while(n!=0){
            num += n%10;
            n = n/10;
            sum = num + n;
        }
        
        if(x%sum != 0) {
            answer = false;
        } 
        System.out.println(sum);        
        return answer;
    }
}
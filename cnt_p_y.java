class Solution {
    boolean solution(String s) {
    boolean answer = true;
    int p=0, y=0;
        
    for(int i=0; i<s.length(); i++)
    {
        if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
            p++;
        }
        if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
            y++;
        }
    }
    if( p != y)
        answer = false;

    return answer;
    }
}
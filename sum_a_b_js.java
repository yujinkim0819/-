function solution(a, b) {
    let answer = 0;
    let min =0, max = 0;
    if(a>b){
        min = b;
        max = a;
    } else {
        min = a;
        max = b;
    }
    for(let i=min; i<=max; i++)
    {
        answer += i;
    }
    return answer;
}
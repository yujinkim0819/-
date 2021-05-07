#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int a, int b) {
    long long answer = 0;
    int min=0, max=0;
    if(a>b){
        min = b;
        max = a;
    } else {
        min = a;
        max = b;
    }
    for(int i=min; i<=max; i++)
    {
        answer += i;
    }
    return answer;
}
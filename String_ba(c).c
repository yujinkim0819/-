#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// �Ķ���ͷ� �־����� ���ڿ��� const�� �־����ϴ�. �����Ϸ��� ���ڿ��� �����ؼ� ����ϼ���.
bool solution(const char* s) {
    bool answer = true;
    if(strlen(s) != 4 && strlen(s) != 6){
        answer = false;
    } else {
        for(int i=0; i<strlen(s); i++){
            if(s[i] < 48 || s[i] > 57){
                answer = false;
            }
        }
    }
    return answer;
}
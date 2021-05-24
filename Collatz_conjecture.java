#include <string>
#include <vector>

using namespace std;

int solution(int num) {
    int answer = 0, cnt = 0;
    while(num != 1){
        if(num%2==0){
            cnt++;
            num = num/2;
        } else if(num%2==1){
            cnt++;
            num = num*3+1;
        } else {
            cnt = -1;
            break;
        }
    }
    answer = cnt;
    return answer;
}
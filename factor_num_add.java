#include <string>
#include <vector>

using namespace std;

int solution(int left, int right) {
    int answer = 0;
    int cnt = 0;
    if( 1 <= left && left <= right && right <= 1000){
        for(int i=left; i<= right; i++){
            cnt = 0;
            for(int j=1; j<=right; j++){
                if(i%j == 0)
                cnt++;
            }
            // printf("cnt : %d -> %d\n", i, cnt);
            if(cnt%2==0){
                answer += i;
            } else {
                answer -= i;
            }
        }
    }
    return answer;
}
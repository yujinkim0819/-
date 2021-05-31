#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// arr_row_len�� 2���� �迭 arr�� ��(����) �����Դϴ�.
// arr_col_len�� 2���� �迭 arr�� ��(����) �����Դϴ�.
// arr[i][j]�� arr�� i��° ���� j��° ���� ����� ���� �ǹ��մϴ�.
int solution(int** arr, int arr_row_len, int arr_col_len, int k) {
    int answer = 0;
    int min = arr[0][0];
    int cnt = 0;
    do{
        for(int i=0; i<arr_row_len; i++){
            for(int j=0; j<arr_col_len; j++){
                if(arr[i][j] < min && arr[i][j] != 0){
                    min = arr[i][j];
                }
            }
        }
        for(int i=0; i<arr_row_len; i++){
            for(int j=0; j<arr_col_len; j++){
                if(arr[i][j] == min){
                    arr[i][j] = 0;
                    answer = min;
                    min = 1000;
                    cnt++;
                    break;
                }
            }
        }
    }while(cnt < k);
    return answer;
}
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
typedef long long ll; 
const int MM = 1e6+3, LOG = 20;
int N, K, arr[LOG][MM], ans;
ll dp[MM];


int rmq(int x, int y){
    int lvl = log2(y-x+1);
    return max(arr[lvl][x], arr[lvl][y-(1<<lvl)+1]);
}

int main() {
    scanf("%d %d", &N, &K);
    for(int i = 1; i<= N; i++)
        scanf("%d", &arr[0][i]);

    for(int i = 1; i<= LOG; i++){
        for(int j = 1; j + (1<<i)-1 <=N; j++){
            arr[i][j] = max(arr[i-1][j], arr[i-1][j+(1<<(i-1))]);
        }
    }
    
    if(2*K>=N){ //subtask 1
        if(K==N){
            ans = rmq(1, N);
            return 0;
        }
        for(int i = N-K; i <= K; i++)
            ans = max(ans, rmq(1, i) + rmq(i+1, N));
        
    }
    else{ //subtask 2
        for(int i = 1; i <= N; i++){
            for(int j = max(0, i-K); j <= max(i-1,(i+K-1)/K-1)*K; j++) //ciel
                dp[i] = max(dp[i], dp[j] + rmq(j+1, i));
        }
        ans = dp[N];
    }
    printf("%lld\n", ans);
    return 0;
}

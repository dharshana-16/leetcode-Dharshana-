// Last updated: 11/10/2026, 08:29:38
1class Solution {
2    public List<Integer> maxPrimes(int n, int s) {
3        List<Integer> result = new ArrayList<>();
4        if(n<2 || s<2){
5            return result;
6        }
7        boolean[]isPrime = new boolean[n+1];
8        Arrays.fill(isPrime, true);
9        isPrime[0] = false;
10        isPrime[1] = false;
11        for(int p=2; (long) p*p <= n; p++){
12            if(isPrime[p]){
13                for(int multiple = p*p; multiple <= n; multiple += p){
14                    isPrime[multiple] = false;
15                }
16            }
17        }
18        long currentSum = 0;
19        for(int p=2; p<=n; p++){
20            if(isPrime[p]){
21                if(currentSum + p <= s){
22                    currentSum += p;
23                    result.add(p);
24                }else {
25                    break;
26                }
27            }
28        }
29        return result;
30    }
31}
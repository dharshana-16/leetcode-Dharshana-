// Last updated: 24/09/2026, 12:50:49
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        int max=0;
4        for(int i=0;i<intervals.length;i++){
5            if(intervals[i][1]>max){
6                max=intervals[i][1];
7            }
8        }
9        int arr[]=new int[2*max+3];
10        for(int i=0;i<intervals.length;i++){
11            arr[2*(intervals[i][0])]++;
12            arr[2*intervals[i][1]+1]--;
13        }
14        int count=0;
15        for(int i=1;i<arr.length;i++){
16            arr[i]+=arr[i-1];
17        }
18        for(int i=0;i<arr.length;i++){
19            if(arr[i]>0 && (i==0 || arr[i-1]==0)){
20                count++;
21            }
22        }
23        int ans[][]=new int[count][2];
24        int low=0;
25        int high=0;
26        
27        int index=0;
28        while(high<arr.length){
29            while(high<arr.length && arr[high]==0){
30                high++;
31            }
32            if(high>=arr.length)break;
33            low=high;
34            while(high<arr.length && arr[high]>0){
35                high++;
36            }
37            
38                ans[index][0]=low/2;
39                ans[index][1]=(high-1)/2;
40                index++;
41                
42            
43
44
45        }
46        return ans;
47
48    }
49}
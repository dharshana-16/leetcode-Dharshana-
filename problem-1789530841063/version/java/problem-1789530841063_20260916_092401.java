// Last updated: 16/09/2026, 09:24:01
1class Solution {
2    public boolean isValid(String code) {
3        Stack<String> stack = new Stack<>();
4        for(int i = 0; i < code.length();){
5            if(i > 0 && stack.isEmpty())
6                return false;
7            if(code.startsWith("<![CDATA[", i)){
8                int j = i + 9;
9                i = code.indexOf("]]>", j);
10                if(i < 0) 
11                    return false;
12                i += 3;
13            }
14            else if(code.startsWith("</", i)){
15                int j = i + 2;
16                i = code.indexOf('>', j);
17                if(i < 0 || i == j || i - j > 9) 
18                    return false;
19                for(int k = j; k < i; k++){
20                    if(!Character.isUpperCase(code.charAt(k))) 
21                        return false;
22                }
23                String s = code.substring(j, i++);
24                if(stack.isEmpty() || !stack.pop().equals(s))
25                    return false;
26            }
27            
28            else if(code.startsWith("<", i)){
29                int j = i + 1;
30                i = code.indexOf('>', j);
31                if(i < 0 || i == j || i - j > 9) 
32                    return false;
33                for(int k = j; k < i; k++){
34                    if(!Character.isUpperCase(code.charAt(k)))
35                        return false;
36                }
37                String s = code.substring(j, i++);
38                stack.push(s);
39            }
40            else{
41                i++;
42            }
43        }
44        return stack.isEmpty();
45    }
46}
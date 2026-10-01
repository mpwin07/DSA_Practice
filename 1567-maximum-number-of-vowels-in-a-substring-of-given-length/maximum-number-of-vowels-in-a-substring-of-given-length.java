class Solution {
    public int maxVowels(String s, int k) {
        char[] ch = s.toCharArray();
        int currV = 0 , maxV = 0;
        int start = 0;
        for(int i = 0 ; i < k; i++){
            if(ch[i] == 'a' ||ch[i] == 'e' ||ch[i] == 'i' ||ch[i] == 'o' ||ch[i] == 'u'){
                currV++;
            }
        }
        maxV = currV;
        for(int end = k; end < ch.length; end++){
            if(ch[end] == 'a' ||ch[end] == 'e' ||ch[end] == 'i' ||ch[end] == 'o' ||ch[end] == 'u'){
                currV++;
            }
             if(ch[start] == 'a' ||ch[start] == 'e' ||ch[start] == 'i' ||ch[start] == 'o' ||ch[start] == 'u'){
                currV--;
            }
            start++;
            maxV = Math.max(currV, maxV);

        }
        return maxV;
    }
}
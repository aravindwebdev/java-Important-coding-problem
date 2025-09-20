import java.util.*;
class firstUnique{
    public static void main(String[] args){
        String s = "leletcode";
        Solution solution = new Solution();
        System.out.println(solution.bruteforce(s));
        System.out.println(solution.optimal(s));
    }
}

class Solution{
    public int bruteforce(String s){    
        int n = s.length();
        for(int i=0; i<n; i++){
            boolean flag = true;
            for(int j=0; j<n; j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag == true) return i;
        }
        return -1;
    }

    public int optimal(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c,0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(count.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}
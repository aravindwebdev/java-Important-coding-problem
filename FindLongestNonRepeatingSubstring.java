public class FindLongestNonRepeatingSubstring{
    public static void main(String[] args){
        Sting  str = "abcabcdc";
        System.out.println(firstLongestNonRepeat(str));
    }
    
    private static int firstLongestNonRepeat(String str){
        int[] seen = new int[256];
        class Solution {
        int[] seen = new int[256];
        int start = 0;
        int max = 0;

        for(int i=0; i<s.length(); i++){
            char currentCharacter = s.charAt(i);
            if(seen[currentCharacter] > start){
                start = seen[currentCharacter];
            }
            seen[currentCharacter]=i+1;
            max = Math.max(max, i+1-start);
        }
        return max;
    }

    //Optimal Solution using HashSet
    private static int findSubString(String s){
        if(s.isEmpty()) return -1;
        int left = 0;
        int max = 0;
        Set<Character> seen = new HashSet<>();

        for(int right = 0; right < s.length(); right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
        seen.add(s.charAt(right));
        max = Math.max(max, right-left +1);
        }
        return max;
    }
}
}

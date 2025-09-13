public class CheckPalindrome{
    public static void main(String args[]){
        String str1 = "abc@12cba  ";
        System.out.println(checkPalindromeOptimal(str1));
    }

    private static boolean checkPalindrome(String str){
        if(str.isEmpty()) return false;
        String formatedString = formatString(str);
        System.out.println(formatedString);
    
        String reverseString = new StringBuilder(formatedString).reverse().toString();
        System.out.println(reverseString);
        return reverseString.equals(formatedString);
    }

    private static String formatString(String str){
        return str.toLowerCase().replaceAll("[^a-z]","");
    }

    private static boolean checkPalindromeOptimal(String str){
        String formatedString = formatString(str);
        char[] character = formatedString.toCharArray();
        int n = character.length;
        if(n < 1) return false;
        if(n == 1) return true;

        int left = 0;
        int right = n-1;

        while(left < right){
            //swap
            if(character[left] != character[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}
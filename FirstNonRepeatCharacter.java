public class FirstNonRepeatCharacter{
    public static void main(String[] args){
        String input = "ababba";
        System.out.println(findFirstNonRepeatCharacter(input));
    }

    private static Character findFirstNonRepeatCharacter(String input){
        int n = input.length();
        if (n<=1) return '$';
        int[] count = new int[256];
        for(int i=0; i<n; i++){
            count[input.charAt(i)]++;
            System.out.println(input.charAt(i));
        }
        for(int i=0; i<n; i++){
            if(count[input.charAt(i)]==1){
                return input.charAt(i);
            }
        }
        return '$';
    }
}

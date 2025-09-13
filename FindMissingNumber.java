public class FindMissingNumber{
    public static void main(String[] args){
        int[] arr1 = {2,1,3};
        System.out.println(findMissingNumber(arr1));
    }

    private static int findMissingNumber(int[] arr){
        int totalSum = 0;
        int nSum = 0;
        int n = arr.length;
        for(int i : arr){
            totalSum += i;
        }
        //sum of n natural numbers - n * (n+1)/2;
        nSum = (n * (n+1))/2;
        return nSum - totalSum;

    }

}
class kadanes{
    public static void main(String[] args){
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArrayOptimal(arr);
        int[] maxSumArray = maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
        for(int i : maxSumArray){
            System.out.print("["+i);
            System.out.println("]");
        }
    }
    //Better
    public static int maxSubArrayBetter(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                    sum += nums[j];
                    max = Math.max(max, sum);
            }
        }
        return max;
    }
    //Optimal
    public static int maxSubArrayOptimal(int[] nums) {
       int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum>max) max = sum;
            if(sum<0) sum = 0;
        }
        return max;
    }

    //follow-up return the subarray
    public static int[] maxSubArray(int[] nums) {
       int max = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        int start = 0;
        int ansStart = -1; int ansEnd = -1;
        int count =0;

        for(int i=0; i<n; i++){
            sum += nums[i];
            if(i==0) start = nums[i];
            if(sum>max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
                count++;
            }
            if(sum<0) { 
                sum = 0;
                start = 0;
                }
        }
        int[] res = new int[count+1];
        for(int i=ansStart; i<ansEnd; i++){
            res[i] = nums[i];
        }
        return res;
    }
}
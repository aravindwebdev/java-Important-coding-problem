public class SecondLargest{
    public static void main(String[] args){
        int arr1[]={4,5,3,1,2};
        int arr2[]={5,5,5};
        int arr3[]={4,5,5};
        int arr4[]={};
        int arr5[]={-1,4,4,5};

        System.out.println(findSecondLargest(arr1));
        System.out.println(findSecondLargest(arr2));
        System.out.println(findSecondLargest(arr3));
        System.out.println(findSecondLargest(arr4));
        System.out.println(findSecondLargest(arr5));
    }

    private static int findSecondLargest(int arr[]){
        if(arr.length == 0 || arr.length == 1) return -1;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num:arr){
            if(max < num){
                secondMax = max;
                max = num;
            }else if(secondMax < num && num != max){
                secondMax = max;
            }
            if(secondMax == Integer.MIN_VALUE) return max;
        }
        return secondMax;
    }
}
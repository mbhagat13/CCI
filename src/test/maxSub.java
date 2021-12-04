package test;

public class maxSub {
    public static int maxSubArray(int[] nums) {


        if(nums.length==1){
            return nums[0];
        }


        int sum = 0, max = nums[0], j = 0, initial = 0;

        for(int i = 0; i < nums.length; i++){

            initial = nums[i];
            sum = 0;
            j = i;

            do{
                sum = sum + nums[j];
                j++;

                if(sum > max){
                    max = sum;
                }
                System.out.println(i + " " + sum);


            }while(j<nums.length && (sum >= 0));

            i = j-1;

        }
        return max;
    }

    public static void main (String [] args){
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));



    }

}

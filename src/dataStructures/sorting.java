package dataStructures;

public class sorting {

    public static int binarySearch(int [] nums, int target){
        int low = 0, mid;
        int high = nums.length-1;

        while (low<=high){
            mid = (low + high)/2;

            System.out.println(mid + " " +nums[mid]);

            if(target > nums[mid]){
                low = mid +1;;

            }else if (target < nums[mid]){
                high = mid - 1;
            }
            else{
                return mid;
            }

        }
        return -1;


    }


    public static void mergeSort(int nums[]){
        int [] helper = new int [nums.length];
        mergeSort(nums, helper, 0, nums.length - 1);
    }


    public static void mergeSort(int [] nums, int [] helper, int low, int high) {

        if(low < high) {
            int mid = (low + high) / 2;
            mergeSort(nums, helper, low, mid);
            mergeSort(nums, helper, mid + 1, high);
            merge(nums, helper, low, mid, high);
        }
    }


    public static void merge(int [] nums, int [] helper, int low, int mid, int high){
        for(int i = low; i<=high; i++){
            helper[i] = nums[i];
        }

        int helperLeft = low;
        int helperRight = mid + 1;
        int current = low;

        while(helperLeft <= mid && helperRight <=high){
            if(helper[helperLeft] <= helper[helperRight]){
                nums[current] = helper[helperLeft];
                helperLeft++;
            }else{
                nums[current] = helper[helperRight];
                helperRight--;
            }
            current++;
        }

        int remaining = mid - helperLeft;

        for(int i = 0; i <= remaining; i++){
            nums[i + current] = helper[i + helperLeft];
        }
    }

    public static void quickSort (int [] arr, int left, int right){
        int index = partition(arr,left,right);

        if(left<index-1){
            quickSort(arr,left,index-1);
        }
        if(index<right){
            quickSort(arr,index,right);
        }

    }

    public static int partition (int [] arr, int left, int right){
        int pivot = arr[(left+right)/2],temp = 0;
        System.out.println(left + " " + right + " " + pivot);
        while(left<=right){
            while(arr[left]<pivot)
                left++;
            while(arr[right]>pivot)
                right--;

            if(left<=right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }


    public static void main (String [] args){
        int [] numbersSorted = {1,5,8,9,34,897,6473,5463354};
        int [] numbersUnsorted = {5, 1, 8,9,34,9000,897,6473,323,5463354};

        //System.out.println(binarySearch(numbersSorted, 897));
        //mergeSort(numbersUnsorted);

        quickSort(numbersUnsorted,0,numbersUnsorted.length-1);


        for(int i = 0; i< numbersUnsorted.length; i++) {
            System.out.println(numbersUnsorted[i]);
        }
    }
}

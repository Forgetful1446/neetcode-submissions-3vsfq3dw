class Solution {
    private static int parent(int i){
        return (i - 1) / 2;
    }

    private static int left(int i){
        return i * 2 + 1;
    }

    private static int right(int i){
        return i * 2 + 2;
    }

    private static void shiftUp(int i, int[] arr){
        while( i > 0 && arr[parent(i)] < arr[i]){
            swap(i, parent(i), arr);
            i = parent(i);
        }
    }

    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void shiftDown(int i, int[] arr, int size){
        while (true){
            int maxIndex = i;
            
            int l = left(i);
            if (l < size && arr[l] > arr[maxIndex]){
                maxIndex = l;
            }

            int r = right(i);
            if (r < size && arr[r] > arr[maxIndex]){
                maxIndex = r;
            }

            if(maxIndex == i) break;

            swap(i, maxIndex, arr);
            i = maxIndex;
        }
    }

    public static void heapify(int[] arr){
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--){
            shiftDown(i, arr, n);
        }
    }

    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        heapify(nums);

        for(int i = n - 1; i >= n - k + 1; i--){
            swap(0, i, nums);
            shiftDown(0, nums, i);
        }

        return nums[0];
    }
}

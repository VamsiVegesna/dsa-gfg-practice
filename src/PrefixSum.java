
public class PrefixSum {

    static int[] arr;
    static int[] sumArr;

//    This method is to pre-calculate the sum in O(n) time and the use it for next operations with O(1) time
    public static void initializeSumArr(int[] inputArr) {
        arr = inputArr;
        sumArr = new int[inputArr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            sumArr[i] = sum;
        }
    }

//    This method takes O(1) time as we already computed the sum
    public static int findSum(int low, int high) {
        return sumArr[high] - sumArr[low-1];
    }
}
public class ReverseArray {

    public static int[] reverse(int[] inputArray) {

        int low = 0;
        int high = inputArray.length - 1;
        while(low < high) {
            int temp = inputArray[high];
            inputArray[high] = inputArray[low];
            inputArray[low] = temp;
            low++;
            high--;
        }
        return inputArray;
    }
}

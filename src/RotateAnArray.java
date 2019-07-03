public class RotateAnArray {

    //Requires O(n) space
    public static int[] rotate(int[] arr, int rotateByElements) {

        int[] rotatedArr = new int[arr.length];
        int d = rotateByElements;
        for (int i = d; i < arr.length; i++) {
            rotatedArr[i-d] = arr[i];
        }
        for (int i = arr.length-d, j=0; i < arr.length; i++, j++) {
            rotatedArr[i] = arr[j];
        }
        return rotatedArr;
    }
//    Other solution: Requires O(d) extra space
//    ====================
//    Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
//    1) Store d elements in a temp array
//    temp[] = [1, 2]
//    2) Shift rest of the arr[]
//    arr[] = [3, 4, 5, 6, 7, 6, 7]
//    3) Store back the d elements
//    arr[] = [3, 4, 5, 6, 7, 1, 2]


    //The below solution happens in O(n) time and takes only O(1) space
    public static int[] rotateWithLessSpace(int[] arr, int rotateByElements) {
        arr = reverseElementsInRange(arr, 0, rotateByElements-1);
        arr = reverseElementsInRange(arr, rotateByElements, arr.length-1);
        arr = reverseElementsInRange(arr, 0, arr.length-1);
        return arr;
    }

    private static int[] reverseElementsInRange(int[] arr, int low, int high) {
        int temp;
        while(low<high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
}

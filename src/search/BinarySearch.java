package search;

/*This class uses Binary search algorithm to find the element in the given sorted array*/
public class BinarySearch {

    /*Let us take sample array as [0, 1, 2, 3, 4, 5]
    * Time complexity = O(logn) */
    public boolean find(int[] arr, int head, int tail, int num) {

        /* mid = head + (head - tail)/2; is better than below as there are chance of overflow
        in below statement when the element has to be found is at the end of the array. This happens when the array size
        is in billions*/
        int mid = (head + tail)/2;
        if (arr[mid] == num) {
            return true;
        }
        if (head == tail) {
            return false;
        }
        if (arr[mid] < num) {
            return find(arr, mid + 1, tail, num);
        } else {
            return find(arr, head, mid - 1, num);
        }
    }

    /*Find left most index of the given element in sorted array
    * Eg Input: [2, 2, 3, 3, 3, 3]
    * Time complexity = O(logn) */
    public int findLeftMostIndex(int[] arr, int head, int tail, int num) {

        int mid = (head + tail)/2;
        if (arr[mid] == num && (mid == 0 || arr[mid -1] != num)) {
            return mid;
        }
        if (head == tail) {
            return -1;
        }
        if (arr[mid] < num) {
            return findLeftMostIndex(arr, mid + 1, tail, num);
        } else {
            return findLeftMostIndex(arr, head, mid - 1, num);
        }
    }

    /*Find right most index of the given element in sorted array
     * Eg Input: [2, 2, 3, 3, 3, 3]*/
    public int findRightMostIndex(int[] arr, int head, int tail, int num) {

        int mid = (head + tail)/2;
        if (arr[mid] == num && (mid == arr.length - 1 || arr[mid + 1] != num)) {
            return mid;
        }
        if (head == tail) {
            return -1;
        }
        if (arr[mid] <= num) {
            return findRightMostIndex(arr, mid + 1, tail, num);
        } else {
            return findRightMostIndex(arr, head, mid - 1, num);
        }
    }

    /*Find the number of occurances of the given element in sorted array
    * Time complexity = O(K + logn) where K is no of occurances of the given element
    * For more optimized solution look at findNoOfOccurancesEff()*/

    public int findNoOfOccurances(int[] arr, int head, int tail, int num) {

        int mid = (head + tail)/2;
        if (arr[mid] == num) {
            int count = 0;
            for (int i = mid; i >= 0; i--) {
                if (arr[i] != num) {
                    break;
                }
                count++;
            }
            for (int i = mid; i < arr.length; i++) {
                if (arr[i] != num) {
                    break;
                }
                count++;
            }
            return count - 1;
        }

        if (arr[mid] < num) {
            return findNoOfOccurances(arr, mid + 1, tail, num);
        } else {
            return findNoOfOccurances(arr, head, mid - 1, num);
        }
    }

    /*Find the number of occurances of the given element in sorted array
     * Time complexity = O(logn)
     * This is optimum solution as it is taking less time than findNoOfOccurances()
     * Here we findLeftMostIndex and findRightMostIndex, then we return the diffrence
     * which = logn + logn = 2logn = O(logn)*/
    public int findNoOfOccurancesEff(int[] arr, int head, int tail, int num) {

        int leftMostIndex = findLeftMostIndex(arr, head, tail, num);
        if (leftMostIndex == -1) {
            return -1;
        }
        return findRightMostIndex(arr, head, tail, num) - leftMostIndex + 1;
    }
}
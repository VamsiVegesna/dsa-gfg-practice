import search.BinarySearch;
import java.util.Scanner;

public class SearchTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int numToFind = sc.nextInt();

        BinarySearch bs = new BinarySearch();

        /*Binary search to find given number in array*/
//        System.out.println(bs.find(arr, 0, size - 1, numToFind));

        /*Find left most index of given number in array
        Eg Array: [2, 2, 3, 3, 3, 3]*/
//        System.out.println(bs.findLeftMostIndex(arr, 0, size - 1, numToFind));

        /*Find right most index of given number in array
        Eg Array: [2, 2, 3, 3, 3, 3]*/
//        System.out.println(bs.findRightMostIndex(arr, 0, size - 1, numToFind));

        /*Find no of occurances of given number in array
        Eg Array: [2, 2, 3, 3, 3, 3]*/
        System.out.println(bs.findNoOfOccurancesEff(arr, 0, size - 1, numToFind));

    }
}
/*
The elements that doesnt have highest elements on their right
 */
public class LeadersInAnArray {

    public static void printLeaders(int[] arr) {

        int currentMax = arr[arr.length-1];
        System.out.println("Leaders are:");
        for (int i = arr.length-1; i>=0; i--) {
            if(arr[i]>=currentMax) {
                System.out.println(arr[i]);
            }
            if(arr[i]>currentMax) {
                currentMax = arr[i];
            }
        }
    }
}

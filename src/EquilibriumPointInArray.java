
// In an array if sum of elements on left side is equal to sum of elements on right side
// then the point is called equilibriumm point
// example: {1,2,1,3,4} here the index of element 3 has
// equilibrium point => sum on left = sum on right = 4
public class EquilibriumPointInArray {

    // Checks if array has an equilibrium point and prints them
    public static void findPoints(int arr[]) {
        int totalSum = 0;
        int leftSum = 0;
        for (int val: arr) {
            totalSum = totalSum + val;
        }
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - arr[i]) {
                System.out.println(i);
            }
            leftSum = leftSum + arr[i];
            totalSum = totalSum - arr[i];
        }
    }
}
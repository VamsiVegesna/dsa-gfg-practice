public class TrapRainWater {

    //Takes n*(n + n) = 2n^2 time ==> n^2 time(removing constants)
    public static int waterTrapped(int[] array) {
        int unitsOfWater = 0;
        for(int i=1; i<array.length-1; i++) {
            unitsOfWater = unitsOfWater + unitsOfWaterAt(array, i);
        }
        return unitsOfWater;
    }

    private static int unitsOfWaterAt(int[] array, int index) {
        int leftMax = 0;
        int rightMax = 0;
        for (int i=0; i<index; i++) {
            if (leftMax < array[i]) {
                leftMax = array[i];
            }
        }
        for (int i=index+1; i<array.length; i++) {
            if (rightMax < array[i]) {
                rightMax = array[i];
            }
        }
        if (leftMax <= rightMax && leftMax > array[index]) {
            return leftMax - array[index];
        }
        if (rightMax <= leftMax && rightMax > array[index]) {
            return rightMax - array[index];
        }
        return 0;
    }

//    Other solution: O(n)
//    =============================
//    MaxElementToLeft store in array => O(n)
//    MaxElementToRight store in array => O(n)
//    Sum(Min(MaxElementToLeft, MaxElementToRight) - currentElement) => O(n)
//    takes 3*O(n) time and 2*O(n) Auxiliary space. This can be reduced further to O(1) space

}

import javafx.scene.transform.Rotate;

import java.util.Scanner;
import bitwiseoperators.KthBitSet;

public class Practice {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        PrintNToOne.print(number);
//        PrintOneToN.print(number);
//        System.out.println(Factorial.findFactorial(number));
//        System.out.println(Factorial.findFactortialTR(number));
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int length = number;
//        System.out.println(RopeIntoPieces.maximumPieces(length, a, b, c));

//        Palindrome test case
//        String input = sc.next();
//        System.out.println(Palindrome.isPalidrome(input));

//        Josephus Problem
//          int n = sc.nextInt();
//          int k = sc.nextInt();
//          System.out.println(JosephusProblem.solve(n, k));

//          Sum of digits
//            int n = sc.nextInt();
//            System.out.println(SumOfDigits.sum(n));

//          Reverse an array
//            int size = sc.nextInt();
//            int[] arr = new int[size];
//            for(int i=0; i<size; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int[] reversedArr = ReverseArray.reverse(arr);
//            for(int i=0; i<reversedArr.length; i++) {
//                System.out.println(reversedArr[i]);
//            }

//        Rotate an array
//            int size = sc.nextInt();
//            int[] arr = new int[size];
//            for(int i=0; i<size; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int rotateByElements = sc.nextInt();
//            int[] rotatedArr = RotateAnArray.rotateWithLessSpace(arr, rotateByElements);
//            System.out.println("Rotated Array is:");
//            for(int i=0; i<rotatedArr.length; i++) {
//                System.out.println(rotatedArr[i]);
//            }

//          Print leaders of an Array
//            int size = sc.nextInt();
//            int[] arr = new int[size];
//            for(int i=0; i<size; i++) {
//                arr[i] = sc.nextInt();
//            }
//            LeadersInAnArray.printLeaders(arr);

//          Trap Rain Water
//              int size = sc.nextInt();
//              int[] arr = new int[size];
//              for(int i=0; i<size; i++) {
//                 arr[i] = sc.nextInt();
//              }
//              int unitsOfWaterTrapped = TrapRainWater.waterTrapped(arr);
//              System.out.println("Units Of Water Trapped:" + unitsOfWaterTrapped);

//            Calculate prefix sum
//                int size = sc.nextInt();
//                int[] arr = new int[size];
//                for(int i=0; i<size; i++) {
//                    arr[i] = sc.nextInt();
//                }
//                int low = sc.nextInt();
//                int high = sc.nextInt();
//                PrefixSum.initializeSumArr(arr);
//                int prefixSum = PrefixSum.findSum(low, high);
//                System.out.println("The prefix sum is:" + prefixSum);

//            Find equilibrium point
//                int size = sc.nextInt();
//                int[] arr = new int[size];
//                for (int i=0; i<size; i++) {
//                    arr[i] = sc.nextInt();
//                }
//                EquilibriumPointInArray.findPoints(arr);

//        Bit wise operators
//        ============================

//            Find if bit is set
              int num = sc.nextInt();
              int k = sc.nextInt();
              System.out.println(k+" bit is set: "+KthBitSet.isSet(num, k));

    }
}

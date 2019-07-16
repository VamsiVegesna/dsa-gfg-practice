package bitwiseoperators;

// Given an array that has most of the elements in it with even occurances except some
// Find those numbers
public class OddOccuranceInArray {

    // This gives output if there is only one odd occurance element
    public static int findOne(int[] arr) {

        int result = 0;
        // We are going to solve this with '^'(XOR) operator
        // Some interesting formulae of XOR(Exclusive OR) are:
        // x ^ 0 = x
        // x ^ x = 0
        // x ^ y = y ^ x
        // (x ^ y) ^ 3 = x ^ (y ^ z)
        for (int i : arr) {
           result = result ^ i;
        }
        return result;
    }

    // This gives output if there are only two odd occurances
    public static int findTwo(int[] arr) {
        return 0;
    }
}


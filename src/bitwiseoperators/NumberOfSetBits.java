package bitwiseoperators;

// This provides the no of set bits for a given number
// For eg: 4 => 100 => 1 set bit
// 5 => 101 => 2 set bits etc.,
public class NumberOfSetBits {

    public static int count(int num) {

        // Normally we can do this in O(32) as we are going to
        // check for all 32 bits whether they are set or not
        // But using Brian Karninghan Algo we can solve it with just O(no of bits set)
        // Time complexity as shown below
        int result = 0;

        while (num > 0) {
            num = num & (num-1);
            result++;
        }
        return result;
    }
}

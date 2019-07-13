package bitwiseoperators;

// FOr example if num = 5 => 101 => 1st and 3rd bits are set 2nd bit is not set as it is 0.
public class KthBitSet {

    // Here n is the given number and k is the bit position to be checked
    public static boolean isSet(int num, int k) {
        if ((num & (1 << (k-1))) != 0)  {
            return true;
        }
        return false;
        // Here firstly get the number whose kth bit is only set
        // Fior that I am left shifting 1 with k-1 so that
        // if k = 1 ==> binary is => 00...001
        // When doing n & (1 << (k-1)) this gives zero if the bit is not set in given position
    }
}
package bitwiseoperators;

// For example 1,2,4 can be written in powers of 2
public class PowerOf2 {

    public static boolean isTrue(int num) {
        if (num >= 0 & (num & (num - 1)) == 0) {
            return true;
        }
        return false;
        // This logic works as below:
        // When you remove one from a nuber that can be written in powers of 2
        // Then it gives all bits aftre it set to 1
        // For example 4 => 100
        // and now 4-1 => 3 => 011
        // when perform & on these to gives 0. Whereas for numbers that are non powers of 2
        // Like 5 => 101
        // 5-1 => 4 => 100 and when you perform & on these two it sleaves some bits set.
        // This becuase for powers of 2 only one bit is set among the 32 bits where as for others
        // more thatn one bit is set
        // In the above logic num defines if it is non zero
    }
}
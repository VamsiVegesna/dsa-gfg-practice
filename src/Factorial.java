public class Factorial {

    public static int findFactorial(int n) {
        if (n == 0||n == 1) {
            return 1;
        }
        // Not Tail recursion as the rescursive statement
        // because even if the recursive method is at end of
        // the block it the 'n' value has to be stored by compiler
        // to get the final product.
        // Where as findFactortialTR is tail recursive.
        return n * findFactorial(n-1);
    }

    public static int findFactortialTR(int n) {
        return findFactortialTR(n, 1);
    }

    private static int findFactortialTR(int n, int result) {
        if (n == 0||n==1) {
            return result;
        }
        // This is now Tail recursive as compiler does not
        // store 'n' value as well as the recursive statement is
        // at the end of the method/block
        return findFactortialTR(n-1, result*n);
    }
}

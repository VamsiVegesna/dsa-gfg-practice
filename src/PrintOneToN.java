public class PrintOneToN {

    public static void print(int n) {
        if (n <= 0) {
            return;
        }
        // Not Tail recursion as the rescursive statement
        // is not at the end of the block
        print(n-1);
        System.out.println(n);
    }
}

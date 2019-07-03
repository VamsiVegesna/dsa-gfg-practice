/* Given 'n' people in a circle, every kth person is killed in iterations.
Find the survivor. */
public class JosephusProblem {

    public static int solve(int n, int k) {
        if (n == 1) {
            return n;
        }
        return (solve(n-1, k) + k -1)%n + 1;
    }
}

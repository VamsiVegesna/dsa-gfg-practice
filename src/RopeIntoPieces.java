/*
 This is the solution for Geeks for Geeks example problem described below.
 Given a rope of length n and three values (a,b,c). We need to make maximum
 pieces such that every piece has length in set {a,b,c}.

 Note: If the rope is not breakable as any of these then return -1
*/
public class RopeIntoPieces {

    public static int maximumPieces(int length, int a, int b, int c) {

        if (length < 0) {
            return -1;
        }
        if(length == 0) {
            return 0;
        }
        //First make a cut with a and call recursively to know max number of cuts with a
        int cutA = maximumPieces(length-a, a, b, c);
        int cutB = maximumPieces(length-b, a, b, c);
        int cutC = maximumPieces(length-c, a, b, c);
        int result = maxOf(cutA, cutB, cutC);
        if(result == -1) {
            return -1;
        }
        return result + 1;
    }

    private static int maxOf(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}

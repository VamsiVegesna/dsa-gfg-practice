public class PrintNToOne {

    public static void print(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        print(n-1);   //Tail recursion
    }
}

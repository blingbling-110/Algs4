import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class E1_1_3 {
    public static void main(String[] args) {
        int i1 = StdIn.readInt();
        int i2 = StdIn.readInt();
        int i3 = StdIn.readInt();
        if (i1 == i2 && i2 == i3)
            StdOut.println("equal");
        else
            StdOut.println("not equal");
    }
}

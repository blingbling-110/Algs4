public class E1_1_20 {
    public static double L(int N) {
        if (N == 1)
            return Math.log(1);
        return Math.log(N) + Math.log(N - 1);
    }

    public static void main(String[] args) {
        System.out.println(L(19));
    }
}

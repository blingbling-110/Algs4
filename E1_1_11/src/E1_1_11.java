public class E1_1_11 {
    public static void main(String[] args) {
        boolean[][] b = new boolean[][] {
                {false, true, false},
                {true,true,true},
                {false, true, false}};
        for (int i = -1; i < b.length; i++) {
            for (int j = -1; j < b[0].length; j++) {
                if (i < 0) {
                    if (j < 0)
                        System.out.print(" ");
                    else
                        System.out.print(j);
                }else {
                    if (j < 0) {
                        System.out.print(i);
                    }
                    else {
                        if (b[i][j])
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

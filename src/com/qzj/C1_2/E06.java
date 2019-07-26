package com.qzj.C1_2;

public class E06 {
//    public static boolean isCR(String s, String t) {
//        for (int i = 0; i < s.length(); i++) {
//            s = s.substring(1) + s.charAt(0);
//            if (s.equals(t))
//                return true;
//        }
//        return false;
//    }

    public static boolean isCR(String s, String t) {
        if (s.length() == t.length() && (s + s).indexOf(t) >= 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isCR("ACTGACG", "TGACGAC"));
    }
}

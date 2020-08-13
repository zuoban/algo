package p01;

import stdlib.StdIn;

/**
 * 练习
 *
 * @author wangjinqiang
 * @date 2020-08-14
 */
public class Practice {

    /**
     * 1.1.1 　给出以下表达式的值：
     * 　　　a. ( 0 + 15 ) / 2
     * 　　　b. 2.0e-6 * 100000000.1
     * 　　　c. true && false || true && true
     */
    public static void p1() {
        int a = (0 + 15) / 2;
        double b = 2.0e-6 * 100000000.1;
        boolean c = true && false || true && true;
        // a = 7, b = 200.0000002, c = true
        System.out.printf("a = %s, b = %s, c = %s\n", a, b, c);
    }

    public static void p2() {
        double a = (1 + 2.236) / 2;
        double b = 1 + 2 + 3 + 4.0;
        boolean c = 4.1 > 4;
        String d = 1 + 2 + "3";
        // a = 1.618, b = 10.0, c = true, d = 33
        System.out.printf("a = %s, b = %s, c = %s, d = %s\n", a, b, c, d);
    }

    public static boolean p3() {
        int[] ints = StdIn.readAllInts();
        if (ints.length != 3) return false;

        return ints[0] == ints[1] && ints[1] == ints[2];
    }


    public static void main(String[] args) {
//        p1();
//        p2();
        p3();
    }
}

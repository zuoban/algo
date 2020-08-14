package p01;

import stdlib.StdIn;
import stdlib.StdOut;

import java.util.Arrays;

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

    public static void p3() {
        int[] ints = StdIn.readAllInts();
        if (ints.length != 3) return;
        if (ints[0] == ints[1] && ints[1] == ints[2]) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void p4() {
        int a = 0, b = 0, c = 0;
        if (a > b) c = 0;
        else b = 0;
    }

    public static boolean p5(double x, double y) {
        return x >= 0 && x <= 1 && y >= 0 && y <= 1;
    }

    /**
     * 斐波那契数列
     */
    public static void p6(int n) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= n; i++) {
            f = f + g;
            g = f - g;
        }
        System.out.println(f);
    }

    public static void p7() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);

        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum2++;
        StdOut.println(sum2);
    }

    public static void p8() {
        // b
        System.out.println('b');
        // 197
        System.out.println('b' + 'c');
        // e
        System.out.println((char) ('a' + 4));
    }

    public static void p9(int num) {
        String s = "";
        for (; num > 0; num /= 2) {
            s = num % 2 + s;
        }
        System.out.println(s);
    }

    /**
     * 编写一段代码，打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。打印出行号和列号
     */
    public static void p11(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void p12() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }


    /**
     * 1.1.13 编写一段代码，打印出一个 M 行 N 列的二维数组的转置 （交换行和列）
     */
    public static void p13(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[i][j] = temp;

            }
        }


    }

    /**
     * 编写一个静态方法lg() ，接受一个整型参数 N，返回不大于 log2N 的最大整数。不要 使用 Math 库
     */
    public static int p14(int n) {
        int m = 1;
        int i = 0;
        for (; m < n; i++) {
            m *= 2;
        }
        return i;
    }

    /**
     * 编写一个静态方法 histogram() ，接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小为M 的数组，
     * 其中第i 个元素的值为整数i 在参数数组中出现的次数。如果a[] 中的值均在0 到M-1 之间，返回数组中所有元素之和应该和 a.length 相等。
     *
     * @return
     */
    public static int[] p15(int[] a, int m) {
        int[] res = new int[m];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < m) {
                res[a[i]]++;
            }
        }
        return res;
    }

    /**
     * 0 1 1 2 3
     *
     * @param n
     * @return
     */
    public static int fibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 0) return 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int fibonacci2(int n) {
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            a = a + b;
            b = a - b;
        }
        return b;
    }

    public static int fibonacci3(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacci3(n - 1) + fibonacci3(n - 2);
    }

    public static void main(String[] args) {
//        p1();
//        p2();
//        p3();
//        for (int i = 0; i < 15; i++) {
//            System.out.println(fibonacci(i) + "\t" + fibonacci2(i) + "\t" + fibonacci3(i));
//        }
//        p7();
//        p8();
//        p9(10);
//        p11(new boolean[][]{{true, false, true}, {false, true, false}, {true, true, false}});
//        p12();
//        System.out.println(p14(2));
        System.out.println(Arrays.toString(p15(new int[]{1, 2, 3, 4, 4, 4, 2, 1, 3, 5,6}, 5)));
    }
}

package p01;

/**
 * @author wangjinqiang
 * @date 2020-08-14
 */
public class Test {
    public static void main(String[] args) {
        final double x = 1 / 0.0;
        System.out.println(x);

        // (a/b)*b + a % b = a
        int a = 12, b = 5;

        // a % b = a - (a/b)*b
        System.out.println((a / b) * b + a % b);
        // -14 % 3 = -14 - (-4) * 3  = -2
        System.out.println(-14 % 3);
        // 14 % -3 = 14 - 4 * 3 = 2
        System.out.println(14 % -3);

    }
}

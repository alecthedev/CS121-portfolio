package Lab13;

public class GCD {

    public static int forLoopGCD(int num1, int num2) {
        int gcd = 0;

        if (num1 == num2) {
            return num1;
        } else {
            for (int i = 1; i <= Math.abs(Math.min(num1, num2)); i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    public static int whileLoopGCD(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        return num1;
    }

    public static int recursionGCD(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        int temp = num2;

        num2 = num1 % num2;
        num1 = temp;

        if (num2 != 0) {
            num1 = recursionGCD(num1, num2);
        }
        return num1;
    }

}

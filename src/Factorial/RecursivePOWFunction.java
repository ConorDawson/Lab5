package Factorial;

public class RecursivePOWFunction {
    public static void main(String[] args) {

        int base = 2, power = 9;
        int result = power(base, power);
        System.out.println(base + "*" + power + "=" + result);



    }

    public static int power(int base, int power) {
        if (power != 0) {

            // recursive call to power()
            return (base * power(base, power - 1));
        }
        else {
            return 1;
        }
    }
}

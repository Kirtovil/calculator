package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {


    public static String plus(int num1, int num2) {
        int num3 = num1 + num2;
        return num1 + "+" + num2 + "=" + num3;
    }

    public static String minus(int num1, int num2) {
        int num3 = num1 - num2;
        return num1 + "-" + num2 + "=" + num3;
    }
    public static String multiply(int num1, int num2) {
        int num3 = num1 * num2;
        return num1 + "*" + num2 + "=" + num3;
    }
    public static String divide(int num1, int num2) {
        int num3 = num1 / num2;
        return num1 + "/" + num2 + "=" + num3;
    }

}

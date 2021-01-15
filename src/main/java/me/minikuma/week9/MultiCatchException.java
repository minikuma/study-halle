package me.minikuma.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wminikuma@gmail.com on 2021/01/13
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class MultiCatchException {
    public static void main(String[] args) {
        try {
            String data1 = args[0]; // 1번 예외
            String data2 = args[1]; // 1번 예외
            int value1 = Integer.parseInt(data1); // 2번 예외
            int value2 = Integer.parseInt(data2); // 2번 예외
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // 1번 혹은 2번 예외
            System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
            System.out.println("[실행 방법]");
            System.out.println("java MultiCatchException num1 num2");
        } catch (Exception e) { // 그 이외의 예외
            System.out.println("알 수 없는 예외 발생");
        } finally {
            System.out.println("다시 실행해 주세요!!");
        }
    }
}

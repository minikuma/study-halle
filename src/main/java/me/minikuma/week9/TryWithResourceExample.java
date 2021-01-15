package me.minikuma.week9;

import java.io.IOError;
import java.io.IOException;

/**
 * Created by wminikuma@gmail.com on 2021/01/13
 * Blog : https://minikuma-laboratory.tistory.com/
 * Github : http://github.com/minikuma
 */
public class TryWithResourceExample {
    public static void main(String[] args) {
        try (FileInputStream fs = new FileInputStream("file.txt")){
            fs.read();
            throw new Exception(); // 강제 예외 발생 -> close() 호출 여부 확인
        } catch (Exception e) {
            System.out.println("예외 코드가 실행되었습니다.");
        }
    }
}

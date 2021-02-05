package me.minikuma.week12;

import javax.annotation.processing.AbstractProcessor;
import java.lang.annotation.*;
import java.util.Arrays;

enum TestType { FIRST, SECOND, THIRD }

@interface DateTime {
    String yyyymmdd();
    String hhmmss();
}

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count();
    String testBy();
    String[] testTools(); // 배열 가능
    TestType testType();  // 열거형 타입 가능
    DateTime testDate();  // 다른 애노테이션을 요소로 정의할 수 있음
}

@TestInfo(
        count = 3, testBy = "kim",
        testTools = {"JUnit", "AutoTest"},
        testType = TestType.FIRST,
        testDate = @DateTime(yyyymmdd = "20210204", hhmmss = "175800")
)
public class MyClass {
    // do something
    public static void main(String[] args) {
        Class<MyClass> myClass = MyClass.class;
        TestInfo anno = myClass.getAnnotation(TestInfo.class);
        System.out.println("count: " + anno.count());
        System.out.println("testType: " + anno.testType().name());
        Arrays.stream(anno.testTools()).map(s -> "testTools: " + s).forEach(System.out::println);
        System.out.println("yyyymmdd: " + anno.testDate().yyyymmdd());
        System.out.println("hhmmss: " + anno.testDate().hhmmss());
    }
}

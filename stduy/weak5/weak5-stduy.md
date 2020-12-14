### [Study-Halle] 5주차 과제. 클래스
* 클래스 정의 하는 방법
* 객체 만드는 방법 (new 연산자)
* 메소드를 정의하는 방법
* 생성자를 정의하는 방법
* this 키워드 이해하기.
---   
#### **| 클래스란 무엇인가?**
> 자바에서 클래스는 모든 자바 프로그램의 기본적인 구조이다. 클래스를 정의하지 않고는 자바 코드를 작성할 수 없다. 모든 자바의 **서술(기술)** 은 클래스를 통해서 가능하며 모든 메소드는 클래스 안에서 구현된다.   
> (참고) **서술(Statement)란?** 프로그래밍에서 실행 가능한 최소의 독립적인 코드 조작을 말한다. 컴파일러가 이해하고 실행할 수 있는 모든 구문이 Statement 이다.
---
이
#### **| 클래스를 정의하는 방법**
> 클래스 정의는 class 키워드 다음에 클래스 이름과 중괄호 안의 클래스의 멤버 집합으로 구성된다. 클래스가 다른 클래스로 확장하는 경우 extends 키워드와 그 뒤에 클래스 이름을 붙인다. 클래스가 하나 이상의 인터페이스를 구현하는 경우 implements 키워드와 여러 개의 인터페이스 목록이 올 수 있다.

```java
public class Integer extends Number implements Serializable, Comparable {
    // class members go here
}
```      

**‍접근 제한자를 통한 클래스 선언**

* abstract
  - 인스턴스화를 할 수없는 불완전한 클래스를 만든다. 
  - 하나 이상의 추상화 메소드를 가지고 있는 클래스인 경우 추상 클래스로 선언해야 한다.   

```java
public class ModifyClass {

  static abstract class Figure {
    abstract void area(int a, int b);
  }

  static class Rectangle extends Figure {
    @Override
    void area(int a, int b) {
      // a: 가로, b: 세로
      System.out.println("사각형의 넓이는 = " + (a * b));
    }
  }

  static class Triangle extends Figure {
    @Override
    void area(int a, int b) {
      // a: 밑변, b: 높이
      System.out.println("삼각형의 넓이는 = " + ((a * b) / 2));
    }
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.area(2, 3);
    Triangle triangle = new Triangle();
    triangle.area(2, 3);
  }
}
```

* final
  * final 키워드를 붙인 클래스는 확장이 되지 않는다.   
  * abstract 와 final 를 함께 사용할 수 없다.    
  * 자바 클래스 중에 대표적으로 String 클래스가 있다.   
    (TMI) String 클래스는 왜 final 이 적용되어 있을까? 불변을 통한 3가지 이점? final 쓸 때 고려사항?  
    - Immutable Object: 동일 인스턴스를 참조하여 복사본을 만들고 공유 가능   
    - Security: 시스템에서 민감한 정보를 변경/수정에 대해 안전하게 다룰 수 있음   
    - Performance: 불변 데이터는 Thread-Safe 환경에서 유용함

* strictfp
  * 플랫폼에 상관없이 부동 소수점 연산에 일관성을 부여한다.   
  * 클래스, 메소드, 인터페이스에 사용이 가능하다.
  
```java
public class ModifyClass {
    
    static strictfp class StrictFP {
        public double add(double number1, double number2) {
            return number1 + number2;
        }
    }

    public static void main(String[] args) {
        StrictFP sfp = new StrictFP();
        System.out.println("결과는 = " + sfp.add(10e+10, 6e+08)); //1.006E11
    }
}
```
---   

#### **| 객체를 만드는 방법 (new 연산자)**    

---
#### **| 메소드를 정의하는 방법**   

---
#### **| 생성자를 정의하는 방법**   

---   
#### **| this 키워드 이해하기**   

---   

#### Reference
* Java in a nutshell, 7th Edition   
* https://blog.lulab.net/programming-java/java-final-when-should-i-use-it/#fn:2   

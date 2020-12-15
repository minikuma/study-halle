### [Study-Halle] 5주차 과제. 클래스
* 클래스 정의 하는 방법
* 객체 만드는 방법 (new 연산자)
* 메소드를 정의하는 방법
* 생성자를 정의하는 방법
* this 키워드 이해하기
---   
#### <font color='red'>**| 클래스란 무엇인가?</font>**
> 자바에서 클래스는 모든 자바 프로그램의 기본적인 구조이다. 클래스를 정의하지 않고는 자바 코드를 작성할 수 없다. 모든 자바의 **서술(기술)** 은 클래스를 통해서 가능하며 모든 메소드는 클래스 안에서 구현된다.   
> 
> (참고) **서술(Statement)이란?** 프로그래밍에서 실행 가능한 최소의 독립적인 코드 조각을 말한다. 컴파일러가 이해하고 실행할 수 있는 모든 구문이 Statement 이다.   

---   
#### <font color='red'>**| 클래스 정의</font>**   
* 데이터 필드 + 메서드로 구성   
* (1) 시그니쳐 (클래스의 이름) + 본문 (중괄호로 묶인 (2) 멤버들: 필드와 메서드 등)    


#### (1) 시그니쳐 특징
* 다른 클래스로 확장(Extends) 선언 가능 (슈퍼 클래스, 서브 클래스 관계 설정)
* 확장(Extends) 시, 클래스의 멤버들 접근을 제어할 수 있음 (public, protected, private 등)
* 다른 클래스를 인터페이스(Interface)로 선언 가능

#### (2) 멤버들(필드 + 메서드) 특징     
* static or non-static 가능   
* static 멤버는 클래스 내부에 속함   
* non-static 멤버는 클래스의 인스턴스와 연결   
* 멤버 종류   
  * 클래스 필드   
  * 클래스 메서드   
  * 인스턴스 필드   
  * 인스턴스 메서드   

```java
public class Signature {
    static class Circle {
        // 클래스 필드
        public static final double PI = 3.14159;

        // 클래스 메서드
        public static double radiusToDegrees(double radians) {
            return 180 * radians / PI;
        }

        // 인스턴스 필드
        public double r;

        // 인스턴스 메서드 (1)
        public double area() {
            return PI * r * r;
        }
        // 인스턴스 메서드 (2)
        public double circumference() {
            return 2 * PI * r;
        }
    }

    public static void main(String[] args) {
        // 클래스 필드 or 메서드는 인스턴스 생성 없이 사용 가능
        double pi = Circle.PI;
        double radiusToDegrees = Circle.radiusToDegrees(5.00);
        System.out.println("pi = " + pi);
        System.out.println("radiusToDegrees = " + radiusToDegrees);
        // 인스턴스 필드 or 메서드는 인스턴스 생성이 필요
        Circle circle = new Circle();
        circle.r = 10;
        double area = circle.area();
        System.out.println("area = " + area);
        double circumference = circle.circumference();
        System.out.println("circumference = " + circumference);
    }
}
```    

#### <font color='red'>**| 클래스를 정의하는 방법</font>**
> 클래스 정의는 class 키워드 다음에 클래스 이름과 중괄호 안의 클래스의 멤버 집합으로 구성된다. 클래스가 다른 클래스로 확장하는 경우 extends 키워드와 그 뒤에 클래스 이름을 붙인다. 클래스가 하나 이상의 인터페이스를 구현하는 경우 implements 키워드와 여러 개의 인터페이스 목록이 올 수 있다.

```java
public class Integer extends Number implements Serializable, Comparable {
    // class members go here
}
```      

**제어자(Modifier)를 통한 클래스 선언**

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

#### **<font color='red'>| 객체를 만드는 방법 (new 연산자)</font>**       

위에서 예제로 만들어 놓은 코드 중에 ```Circle circle = new Circle()```를 살펴보자. 해당 코드를 작성하면 ```Circle```클래스는 인스턴스 멤버들을 사용할 수 있었다.       

왜 이런 일이 발생할까? 실제로는 ```Circle()```는 생성자의 한 예이다.       

```new```연산자는 생성자와 관계가 있다. ```new```통한 인스턴스 과정을 살펴보면서 관계를 알아보자.        

```new```라는 연산자를 통해 객체를 만드는 과정은 다음과 같다.       

```new```연산자는 클래스에 새로운 인스턴스가 필요하다는 사실을 알려준다. 그 다음은 새로운 객체 인스턴스를 보관할 메모리를 할당하고 생성자 본문을 호출한다. 파라미터가 있다면 파라미터도 추가하여 호출한다. 호출된 생성자는 필요한 새로운 인스턴스 객체의 초기화를 수행한다. 참고로 클래스 생성자를 명시적으로 정의하지 않은 경우에는 기본 생성자를 자동으로 만들게 된다.        

결국 ```new```연산자는 생성자를 호출하는 역할을 수행하여 객체 인스턴스를 만들고 해당 객체를 초기화 하는 작업을 하게 된다.        

---       

#### <font color='red'>**| 메소드를 정의하는 방법</font>**         
(1) 메소드 정의     
* 자바 클래스 내부에 존재하며, 어떤 특정 작업을 처리하기 위한 명령문의 집합      

(2) 정의 방법      
```
접근 제어자 반환타입 메소드이름 (매개변목록) { //선언부
    // 구현부  
}
```      
* 접근 제어자: 해당 메소드에 접근할 수 있는 범위 (예) public, private 등       
* 반환 타입: 메서드가 모든 작업을 마치고 반환하는 데이터 타입 (예) void, 클래스 명 등     
* 메서드 이름: 메서드를 호출하기 위한 이름       
* 매개변수 목록(Parameter): 메서드 호출 시 전달되는 인수의 값을 저장할 변수      

(3) 메서드 호출 방법      
```
Test test = new Test(); // 인스턴스 생성
String a = test.say();  // Test 클래스에 선언된 say() 메서드를 호출    
System.out.println(a);  // HI 출력
=> 리턴 받을 변 = 객체.메서드명(); 으로 호출   
```

(3) 다양한 메서드 선언 방법    
* 입력 값 없고 반환 값 없음      
* 입력 값 있고 반환 값 없음
* 입력 값 없고 반환 값 있음         
* 입력 값 있고 반환 값 있음   

```
// 입력 값 없고 반환 값 없음
public void say() {
    System.out.println("say hello");
}  

// 입력 값 있고 반환 값 없음
public void sum(int a, int b) {
    System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
}

// 입력 값 없고 반환 값 있음  
public String say(String name) {
    return "Hi" + name;
}

// 입력 값 있고 반환 값 있음
public int sum(int a, int b) {
    return a + b;
}   
```      

(4) 메서드 시그니쳐      

메서드 명과 매개변수의 개수와 타입, 그 순서를 의미 한다. 단 반환 타입은 포함되지 않는다. 이러한 자바의 메서드 시그니쳐 특징으로 인해 메서드 오버로딩이 발생하는 데 아래 예제를 한번 보자.      

```
public int add (int a, int b) {
    return a + b;
}

public String add (String a, String b) {
    return (a + ":" + b + "의 덧셈");
}
```
예제를 보면 ``add()`` 메서드가 2개인데, 이렇게 같은 이름을 선언할 수 있는 이유는 메서드 시그니쳐 때문이다. 같은 메서드 이름이여도 매개변수의 개수와 타입, 그 순서만 같지 않는다면 같은 이름의 메서드를 만들 수 있다.      

(5) 메서드 오버로딩     
* 메서드의 이름을 절약할 수 있다.    
* 메서드를 호출할 전달해야 할 매개변수 타입이나 개수에 크게 신경쓰지 않아도 된다.    
* 자바의 다형성 (Polymorphism)을 구현하는 방법 중 하나이다.  
* 대표적으로 ``println()`` 메서드가 있다.

```
1. println()
2. println(boolean x)
3. println(char x)
4. println(char[] x)
5. println(double x)
6. println(float x)
7. println(int x)
8. println(long x)
9. println(Object x)
10. println(String x)
```


---     

#### <font color='red'>**| 생성자를 정의하는 방법</font>**        
(1) 생성자 규칙      

```생성자 = 초기화```라는 개념을 가지고 여러 가지 생성자를 정의하는 방법을 알아보자. 생성자를 이용하여 기존 ```Circle```클래스를 수정해 보자.         
```java
public class Signature {
  static class Circle {
    // 인스턴스 필드
    public double r;

    // 생성자 추가
    public Circle(double r) {
      this.r= r;
    }
  }
}
```             
생성자가 없던 코드에는 인스턴스 필드를 초기화 하기 위해서는 클라이언트쪽 코드에 다음과 같은 코드를 작성해야 했다.          
```
Circle circle = new Circle();
circle.r = 10;
```          
하지만 생성자를 추가한 뒤 클라이언트쪽 코드를 보면 다음과 같다.          
```
Circle circle = new Circle(10); // 인스턴스 생성 시, 인스턴스 필드 값 초기화
```
        
생성자를 만들기 위해서는 몇 가지 알아두어야 할 사실이 있다.     
* 생성자 이름은 항상 클래스 이름과 동일해야 한다.          
* 생성자는 반환 타입이 없다. (void 도 없다.)       
* 생성자의 본문은 객체를 초기화 하는 코드이다. this 참조라 생각할 수 있다.        
* 생성자는 this 혹은 다른 값을 반환할 수 없다.    
* 일반적인 메서드 호출 방식으로 호출 할 수 없다.    
* 생성자는 상속이 되지 않는다.

(2) 다양한 정의 방법        
* 여러 생성자 정의 가능 (오버로딩)     
```
Circle() {....} // 매개 변수 없음
Circle(int a) {....} // 매개 변수 1개 
Circle(int a, String b) {....} // 매개 변수 2개
Circle(String b, int a) {....} // 매개 변수 2개 (순서가 다른 경우)
```
---   
#### <font color='red'>**| this 키워드 이해하기</font>**            
(1) this 키워드 정체     

자바에서 제공하는 ```this```는 자기 자신의 인스턴스를 참조하는 키워드이다. 따라서 this 키워드를 통해 클래스의 메서드 및 생성자에서 데이터를 조작할 수 있다.       

하지만 오해하기 쉬운 사실이 하나 있다. 그것은 바로 ```this```는 현재 클래스 기준으로 생성된 인스턴스의 참조값이라는 사실과 인스턴스의 참조값과 인스턴스 자체값은 다르다는 사실이다.        

(2) this 사용하기 전에 알아야 될 것들    
* 암묵적으로 생략이 가능하다.     
* 자체 필드 혹은 메서드에 접근한다는 사실을 명확하게 하는 용도로 사용할 수 있다.    
* 꼭 사용해야 하는 경우: 메소드의 파라미터 또는 지역 변수가 동일한 이름을 가진 경우          
```
public void setRadius(double r) {
    this.r = r;  // 파라미터: r 과 지역변수 r 구분
}
```
(3) 인스턴스 참조 값과 인스턴스 자체값이 다른 이유     
```java
public class ThisKeyword {
    private int id;
    private String name;

    public ThisKeyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id; // 메소드 파라미터와 지역변수 구분
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThisKeyword returnInstance() {
        return this;  // 인스턴스 참조 
    }

    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword(5, "Good");
        System.out.println("t = " + t);
        System.out.println("this = " + t.returnInstance());
        t.setId(5);
        System.out.println("t.getId() = " + t.getId()); // 5
        t.returnInstance().setId(7);
        System.out.println("t.returnInstance().getId() = " + t.returnInstance().getId()); // 7
    }
}
```       

<p align="center"><img width="600" alt="this-keyword" src="https://user-images.githubusercontent.com/20740884/102098051-0bc75380-3e6a-11eb-82d7-a3848be006fd.png"></p>              

위의 그림은 예제 코드를 JVM 메모리 모델로 간략하게 표시한 그림이다. ````ThisKeyword t = new ThisKeyword(5, "Good");````, ```t.returnInstance();``` 2가지 코드에 주목해 보자.       

첫 번째는 ```new```키워드를 통해 생성자를 인스턴스로 생성하였다. stack 영역에는 ```t```라는 변수가 만들어지고, ```t```는 실제 클래스의 인스턴스의 참조값을 갖게 된다.      

두 번째 ```this```는 클래스의 ```returnInstance()```메서드를 통해 만들어서 ```this```를 반환하였다. 여기서 ```this```는 현재 자신의 인스턴스 참조값을 갖는다.        

위에 그림을 다시 보면 실제 인스턴스를 참조하는 stack 영역의 변수가 2개, 실제 인스턴스는 1개이다. Stack 영역의 별도 공간에 변수가 할당되어 있지만 결국 같은 인스턴스 참조값을 갖게 된다.       

---   

#### Reference
* Java in a nutshell, 7th Edition   
* https://blog.lulab.net/programming-java/java-final-when-should-i-use-it/#fn:2       
* https://engkimbs.tistory.com/873      
* http://www.tcpschool.com/java/java_usingMethod_overloading
package pack;

import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();

        User user = new User();
        pack.b.User userB = new pack.b.User();
    }
}

/*

패키지 주의사항
    1. 패키지는 사용하는 경우 항상 코드 첫 줄에 패키지 이름을 적어주어야 한다.
    2. 패키지의 이름과 위치는 폴더(디렉터리) 위치와 같아야 한다. (필수)
    3. 패키지의 이름은 모두 소문자를 사용한다. (관례)
    4. 패키지의 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다.
        - com.company.myapp 과 같이 사용한다. (관례)
        - 수 많은 외부 라이브러리가 함께 사용되면 같은 패지키에 같은 클래스 이름이 존재할 수수도 있다.
        - 이렇게 도메인 이름을 거꾸로 사용하면 이런 문제를 방지할 수 있다.
        - 오픈소스나 라이브러리를 만들어서 외부에 제공한다면 위의 관례를 꼭 지키는 것이 좋다.
        - 내가 만든 애플리케이션을 다른 곳에 공유하지 않고, 직접 배포한다면 보통 문제가 되지 않는다.

com.sungilshop

user
    User Class
    userService
product
    Product Class
    ProductService
order
    Order Class
    OrderService
    OrderHistory

 */

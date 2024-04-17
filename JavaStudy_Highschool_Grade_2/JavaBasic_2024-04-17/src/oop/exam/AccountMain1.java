package oop.exam;

public class AccountMain1 {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.deposit(10000);

        acc.withdraw(9000);

        acc.withdraw(2000);


    }
}

/*
hashset
    set 인터페이스에서 지원하는 구현 클래스
    순서대로 입력되지 않고, 일정하게 유지되지 않는다.
    null 요소도 허용이 됨
    중복을 허용하지 않는다.
중복을 걸러내는 과정
    객체를 저장학 전에 먼저 객체의 hashCode() 메소드를 호추래서 해시 코드를 얻어 낸 다음
    지정되어 있는 객체드르이 해시 비교한 뒤 같은 해시 ㅋ드가 있다면 다시 equals() 메소드로
    두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.
 선언
    HashSet<Integer> set = new HashSet<Integer>();

 메소드
    add(value) : 값 추가
    remove(value) : 값 제거
    clear() : 모든 값 제거
    size() : hashSet 크기
    contains(value) : 값이 있는지 확인

출력
    System.out.println(set); 하면 전체 출력이 됨
    get 메소드가 존재하지 않아서 하나의 객체를 가지고 올 수 수가 없다.
    하나의 객체를 가져오기 위해서는 Iterator를 사용해야 함
        Iterator
            전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자
            iterator() 메서도를 호출하면 얻을 수 있음
            Iterator에서 하나의 객체를 가져올 때는 next() 메서도를 사용
            먼저 가져올 객체가 있는지 확인하기 위해 hasNext() 메서도를 사용하여 확인
                haseNext() 메소드는 가져올 객체가 있으면 true, 없으면 false를 반환
선언
Iterator iter  set.iterator();
while (iter.hasNext()) {
    System.out.println(iter.next());
 */

package classExam;
// 자바에서 '비어있음'이 null이라는 값으로 표현
// 단, null은 참조형 변수만 가질 수 있는 값

// 만약 null을 보관하고 있는 변수의 메소드를 호출 시
// NullPointerException 이라고 오류가 발생한다는 점을 주의

public class nullEx {
	public static void main(String[] args) {
		Person p1 = null;
		
		Person[] peoples = new Person[5];
		peoples[0] = new Person(name+"홍길동"+52);
		peoples[2] = new Person(name+"장발장"+29);
		peoples[3] = new Person(name+"임꺽정",66);
		
		for (int i=0; i<peoloes.lengt; i++) {
			Person p = peoples[i];
			if (peoples[i] = null) {
				System.out.println("비어있음");
			} else {
			System.out.println(p.getName());}
		}
		
	}
	
}

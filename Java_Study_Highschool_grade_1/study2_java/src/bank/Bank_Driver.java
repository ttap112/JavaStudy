package bank;

public class Bank_Driver {
	
	public static void main(String[] args) {
		
		//  인서트넌트를 생성하기 위해서는 '생성자'를 사용해야 한다.
		//	지금은 생성자를 인스턴트를 생성하는 메소드 정도라고 생각하면 된다.
		//	생성자 new 키워드와 함께 클래스 이름과 동일한 이름으로 써준다.
		
		Person p1 = new Person();
		p1.Setname("홍길동");
		// p1.age = 25;
		p1.setAge(25);
		p1.Set_CashAmount(50000);
		
		// p2 객체 생성
		Person p2 = new Person();
		p2.Setname("장발장");
		// p2.age = 30;
		p2.setAge(30);
		p2.Set_CashAmount(50000);
		
		// p3 객체 생성
		Person p3 = new Person("홍홍홍");
		
		Person p4 = new Person("홍길",20);
		
		System.out.println(p4.getName()+p4.getAge());
		
		
		
		
		// 이름 나이 손에 있는 돈 출력
		System.out.println("  이름   나이    돈");
		System.out.println("------------------------");
		
		System.out.print(" "+p1.getName()+" | ");
		System.out.print(p1.GetAge()+" | ");
		System.out.print(p1.Get_CashAmount());
		System.out.println("");
		
		System.out.print(" "+p2.getName()+" | ");
		System.out.print(p2.GetAge()+" | ");
		System.out.print(p2.Get_CashAmount());
		System.out.println("");
		
		// a1 계좌 생성
		Bank_Account a1 = new Bank_Account();
		a1.Set_balance(100000);
		
		// a2 계좌 생성
		Bank_Account a2 = new Bank_Account();
		a2.Set_balance(100000);
		
		// 두 객체의 관계 설정
		p1.Set_Account(a1);
		a1.Set_owner(p1);
		
		p2.Set_Account(a2);
		a2.Set_owner(p2); 
		
		//테스트
		//ooo님의 계좌 잔액은 ooo원 입니다.
		
//		System.out.println("------------------------");
//		System.out.println(" "+"p1의 통장잔액 : " + p1.balance);
		
		//출금테스트
		
		
		
		//이체 테스트
		System.out.println(p1.getName() + "의 통장잔액" + p1.Get_Account().Get_balance());
		System.out.println(p2.getName() + "의 통장잔액" + p2.Get_Account().Get_balance());
		a1.transfer(p2, 20000);
		System.out.println(p1.getName() + "의 통장잔액" + p1.Get_Account().Get_balance());
		System.out.println(p2.getName() + "의 통장잔액" + p2.Get_Account().Get_balance());
		a2.transfer(a1, 20000);
		System.out.println(p1.getName() + "의 통장잔액" + p1.Get_Account().Get_balance());
		System.out.println(p2.getName() + "의 통장잔액" + p2.Get_Account().Get_balance());
		
		
	}
}

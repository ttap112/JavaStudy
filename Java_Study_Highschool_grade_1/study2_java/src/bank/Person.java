package bank;

public class Person {
	
	// 필드
	private String name;	// 이름
	private int age;		// 나이
	private int CashAmount;	// 현금
	private Bank_Account Account;
	
	// 생성자
	// 기본 생성자
	public Person() {}
	
	public Person(String New_name) {
		name=New_name;
	}
	
	public Person(String new_name,int age) {
		this.name=new_name;
		if(age>=0) {
			this.age=age;
		}
	}
	
	//getter&setter
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >=0) {
			this.age = age;
		}
	}

	public int getCashAmount() {
		return CashAmount;
	}

	public void setCashAmount(int cashAmount) {
		CashAmount = cashAmount;
	}

	public Bank_Account getAccount() {
		return Account;
	}

	public void setAccount(Bank_Account account) {
		Account = account;
	}

		boolean transfer(Bank_Account to, int amount) {
			
			return transfer(to.Get_owner(), amount);
				
		}
	
	
	
	// 이체 - transfer
	// 첫번째 파라미터 : 받는 사람(Person)
	// 두번째 파라미터 : 이체 금액(정수{int})
	// 리턴 : 성공여부(블리언{boolean)
boolean transfer(Person to, int amount) {
		
		if (amount <0 || amount > Account.Get_balance()) {
			System.out.println(" 이체 실패입니다. from : " +name+", to : "+to.name+", 시도금액 : "+amount);
			return false;
		}
		
		Account.Set_balance(Account.Get_balance()-amount); 
		to.Account.Set_balance(to.Account.Get_balance()+amount); 
		System.out.println(" 이체 성공입니다. from : " +name+", to : "+to.name+", 이체금액 : "+amount);
		
		return true;

	}
	
	public String getName() {
	return name;
	}
}




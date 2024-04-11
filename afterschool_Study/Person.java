package bank;

public class Person {
	
	// 필드
	private String name;	// 이름
	private int age;		// 나이
	private int CashAmount;	// 현금
	private Bank_Account Account;
	
	//간접적으로 Age 값을 조건에 따라 추가 하기
	public void setAge(int newAge) {
		if (newAge > 0) {
			age = newAge;
		} else {
			System.out.println("올바른 나이를 입력하시오.");
		}
	}
	
	public int GetAge() {
		return age;
	}
	
	// 나이
	public void Setname(String NewName) {
		name = NewName;
	}
	
	public String GetName() {
		return name;
	}
	
	// 현금
	public void Set_CashAmount(int New_CashAmount) {
		if (New_CashAmount > 0) {
			CashAmount = New_CashAmount;
		} else {
			System.out.println("올바른 값을 입력하시오 | 현재 입력한 값 : "+New_CashAmount);
		}
		
	}
	
	public int Get_CashAmount() {
		return CashAmount;
	}
	
	// Bank Account
	
	public void Set_Account (Bank_Account New_Account) {
		Account = New_Account;
	}
	
	public Bank_Account Get_Account() {
		return Account;
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
		to.Account.Set_balance(Account.Get_balance()+amount); 
		System.out.println(" 이체 성공입니다. from : " +name+", to : "+to.name+", 이체금액 : "+amount);
		
		return true;

	}
	
	boolean transfer(Bank_Account to, int amount) {
		
		return transfer(to.Get_owner(), amount);
			
	}
	
}




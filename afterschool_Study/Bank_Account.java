package bank;

public class Bank_Account {
	
	private int balance;		// 잔고
	private Person owner;		// 소유인
	
	// balance 
	
	public void Set_balance(int new_balance) {
		if (new_balance>0) {
			balance = new_balance;
		} else {
			System.out.println("값이 잘못 설정 되었습니다 다시 설정하십시오.");
		}
	}
	
	public int Get_balance( ) {
		return balance;
	}
	
	public void Set_owner(Person new_owner) {
		owner=new_owner;
	}
	
	public Person Get_owner() {
		return owner;
	}
	
	// 입금 - deposit
	// 파라미터 : 출금할 금액(정수{int})
	// 리턴 : 성공여부(블리언{boolean})
	
	boolean deposit(int amount) {
		
		if (amount < 0 || amount > owner.Get_CashAmount()) {
			System.out.println(" 입금 실패입니다. 잔고 : " + balance + "원 | 현금 : "+owner.Get_CashAmount());
			return false;
		}
		
		balance += amount;
		owner.Set_CashAmount(owner.Get_CashAmount()-amount);
		
		System.out.println(amount + " 원 입금하였습니다. 잔고 : " + balance + "원 | 현금 : "+owner.Get_CashAmount());
		
		return true;
	}
	
	// 출금 - withdraw
	// 파라미터 : 출금할 금액(정수{int})
	// 리턴 : 성공여부(블리언{boolean})
	
	boolean withdraw(int amount) {
		
		if (amount < 0 || amount > balance) {
			System.out.println(" 출금 실패입니다. 잔고 : " + balance + "원 | 현금 : "+owner.Get_CashAmount());
			return false;
		}
		
		balance -= amount;
		owner.Set_CashAmount(owner.Get_CashAmount()-amount);
		
		System.out.println(" "+amount + "원 출금하였습니다. 잔고 : " + balance + "원 | 현금 : "+owner.Get_CashAmount());
		
		return true;
	}
	
	// 이체 - transfer
	// 첫번째 파라미터 : 받는 사람(Person)
	// 두번째 파라미터 : 이체 금액(정수{int})
	// 리턴 : 성공여부(블리언{boolean)
	
	boolean transfer(Person to, int amount) {
		
		if (amount <0 || amount > balance) {
			System.out.println(" 이체 실패입니다. from : " +owner.GetName()+", to : "+to.GetName());
			return false;
		}
		
		balance -= amount;
		to.Get_Account().balance += amount;
		System.out.println(" 이체 성공입니다. from : " +owner.GetName()+", to : "+to.GetName()+", 이체금액 : "+amount);
		
		return true;

	}
	
	boolean transfer(Bank_Account to, int amount) {
		
		return transfer(to.owner, amount);
			
		
		
	}
	
}

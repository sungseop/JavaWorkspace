package sec06_user_defined_exception;

public class CheckAccountTest {

	public static void main(String[] args) {
		
		// 계좌 개설
		CheckAccount account = new CheckAccount(12345);

		// 입금
		account.deposit(10000000);
		
		System.out.println("현재 잔액은 "+account.getBalance()+"원 입니다.");
		
		try {
			// 출금
			account.withdraw(3000000);
			System.out.println("현재 잔액은 "+account.getBalance()+"원 입니다.");
			account.withdraw(8000000);
		} catch (FailException e) {
			e.printStackTrace();
		}
	}

}

class FailException extends Exception {
	private long amount;
	
	public FailException(long amount) {
		super("죄송합니다. 잔액이 부족합니다. 부족한 금액: "+amount+"원");
	}
}
